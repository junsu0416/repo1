package emp2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



import emp2.dto.EmpDTO;





public class EmpDAO {
	
	private Connection getConnection() {
		
		Connection con = null;
	      
	      String driver = "oracle.jdbc.driver.OracleDriver";
	        String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
	        String user = "scott2_6";
	        String password = "tiger";
	        
	           try {
	           
	           // Class.forName : String을 이용해서 class를 생성한다
	           // driver : 서로 다른 것들 (java, oracle)이 소통할 수 있게 도와줌
	           // 오라클 드라이버 로딩
	           Class.forName(driver);
	           
	           // DB 접속
	           con = DriverManager.getConnection(url, user, password);
	           } catch (Exception e) {
	              e.printStackTrace();
	           }
	           return con;
		
	}
	
	public List selectEmp(String empno1 ) {
			return selectEmp(empno1, 1 , 10);
	}
	
	public List selectEmp(String empno1 , int start , int end) {
		List list = new ArrayList();
		
		try {
	         Context ctx = new InitialContext();
	         DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
	         
	         Connection con = dataSource.getConnection();
	         
	         String query = null;
	         PreparedStatement ps = null;
	         
	         if(empno1 == null) {
//	        	 query = "SELECT * FROM emp2";
	        	 	query =  " select * ";
	             	query += " from ( ";
	                query += "    select rownum rnum, empno, ename ";
	                query += "    from ( ";
	                query += "        select empno, ename ";
	                query += "        from emp ";
	                query += "        order by ename ";
	                query += "    ) ";
	                query += " ) ";
	                query += " where rnum >= ? and rnum <= ?";
	         } else if (empno1 != null) {
	        	 	query = "SELECT * FROM emp2 where empno = ?";
	         }
	         ps = con.prepareStatement(query);
	         
	         if(empno1 != null) {
	        	 ps.setInt( 1, Integer.parseInt(empno1) );
	         }
	         
	        
	         
	         ResultSet rs = ps.executeQuery();
	         
	         while( rs.next() ) {
	        	 EmpDTO empDTO = new EmpDTO();
	        	 
	        	 int empno = rs.getInt("empno");
	        	 empDTO.setEmpno(empno);
	        	 
	        	 String ename = rs.getString("ename");
	        	 empDTO.setEname(ename);
	        	 
	        	 empDTO.setJob( rs.getString("job") );
	        	 empDTO.setHireDate( rs.getDate("hiredate") );
	        	 
	        	 empDTO.setDeptno(rs.getInt("deptno"));
	        	 
	        	 list.add(empDTO);
	         }
	         ps.close();
	         con.close();
	         
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		return list;
	}
	
	public int insertEmp(EmpDTO dto) {
		int result = -1;
		
		// DB 접속 
		
		try {
	         Context ctx = new InitialContext();
	         DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
	         
	         Connection con = dataSource.getConnection();
	         
	      // SQL 준비
	         String query = " INSERT INTO emp2 (empno , ename , job , sal , deptno , hiredate)";
	         		query += " VALUES (? , ? , ? , ? ,? , ?)";
//	         PreparedStatement ps = con.prepareStatement(query);
	         		
	         // 원래 실행되는 걸 LoggableStatement 가 가로채서 
	         PreparedStatement ps = new LoggableStatement(con, query);
	         ps.setInt(1, dto.getEmpno());
	         ps.setString(2, dto.getEname());
	         ps.setString(3, dto.getJob());
	         ps.setInt(4, dto.getSal());
	         ps.setInt(5, dto.getDeptno());
	         ps.setDate(6, dto.getHireDate());
	         
	         // 실제 실행되는 sql 을 출력해볼 수 있다 
	         System.out.println(( (LoggableStatement)ps ).getQueryString() );
	         
	         
	      // SQL 실행
	         result = ps.executeUpdate();
	         
	         ps.close();
	         con.close();	// 커넥션 풀에 접속정보 반환 
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	
	
	public EmpDTO selectOne(int empno) {
		EmpDTO empDTO = null;
		
		// DB 접속 
		Connection con = getConnection();
		
		// 접속이 안 되었다면 null을 바로 리턴한다
		if(con == null ) return null;
		
		try {
			// SQL 준비 
			String sql = "select * from emp2 where empno = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			// ?를 값으로 채워줌
			// 첫번째 전달인자는 ?의 순서 
			// 만약에 글씨라면 setString , 알아서 '로 감싸준다
			ps.setInt(1 , empno);
		
			
			// SQL 실행 및 결과 확보 
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			if( rs.next() ) {
				empDTO = new EmpDTO();
				empDTO.setEmpno(    rs.getInt("empno"));
				empDTO.setEname(   	rs.getString("ename"));
				empDTO.setJob( 		rs.getString("job"));
				empDTO.setHireDate(	rs.getDate("hiredate"));
				empDTO.setDeptno(	rs.getInt("deptno"));
			}
			
		} catch(Exception e) {
        	e.printStackTrace();
        } 
		
		System.out.println(empDTO);
		return empDTO;
		
		
	}
	
	public int update(EmpDTO empDTO) {
		
		int result = -1;
		
		try {
			
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle");
			
			Connection con = dataFactory.getConnection();
			
			String query = " UPDATE emp2";
				   query += " SET ename = ? , job = ? , hiredate = ? , deptno = ?";
				   query += " WHERE empno = ?";
				   
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, empDTO.getEname());
			ps.setString(2, empDTO.getJob());
			ps.setDate(3, empDTO.getHireDate());
			ps.setInt(4, empDTO.getDeptno());
			ps.setInt(5, empDTO.getEmpno());
			
			result = ps.executeUpdate();
			
			ps.close();
			con.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
		
	}
	
	

	

}
