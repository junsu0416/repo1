package emp2.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

@WebServlet("/emp2")
public class Emp2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/emp2 doGet 실행");
		
//		String no = request.getParameter("no");
//		System.out.println("no : " + no);
		
		String empno1 = request.getParameter("empno");
		System.out.println("empno : " + empno1);
		
		String ename1 = request.getParameter("ename");
		System.out.println("ename : " + ename1);
		
		String job1 = request.getParameter("job");
		System.out.println("job : " + job1);
		
		String hiredate1 = request.getParameter("hiredate");
		System.out.println("hiredate : " + hiredate1);
		
		String deptno1 = request.getParameter("deptno");
		System.out.println("deptno : " + deptno1);
		
		try {
			 // # DB 에서 emp2 조회하기 
			
			 // ## DB 접속 방식 
			 // JNDI 방식으로 
			 // Servers 폴더의 context.xml 중 Resource 태그(노드)를 가져온다 
			 // 거기에는 DB 정보가 있다 
			 // 그걸로 DataSource 만든다 
			 // DataSource 가 커넥션 풀이라고 생각하면 된다
	         Context ctx = new InitialContext();
	         DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
	         
	         // 커넥션 풀에서 접속 정보를 가져오기
	         Connection con = dataSource.getConnection();
	         // ## DB 접속 끝 
	         
	         // SQL 준비
	         String query = null;
	         PreparedStatement ps = null;
	         
	         
	         if(empno1 == null || ename1 == null || job1 == null || hiredate1 == null || deptno1 == null) {
	        	 query = "SELECT * FROM emp2";
	         }
	         if(empno1 != null) {
	        	 query = "SELECT * FROM emp2 where empno = ?";
	         }
	         if(ename1 != null) {
	        	 query = "SELECT * FROM emp2 where ename = ?";
	         }
	         if(job1 != null) {
	        	 query = "SELECT * FROM emp2 where job = ?";
	         }
	         if(hiredate1 != null) {
	        	 query = "SELECT * FROM emp2 where hiredate = ?";
	         }
	         if(deptno1 != null) {
	        	 query = "SELECT * FROM emp2 where deptno = ?";
	         }
	         

	         
	         ps = con.prepareStatement(query);
	         
	         if(empno1 != null) {
	        	 ps.setInt( 1, Integer.parseInt(empno1) );
	         }
	         if(ename1 != null) {
	        	 ps.setString( 1, ename1 );
	         }
	         if(job1 != null) {
	        	 ps.setString( 1, job1 );
	         }
	         if(hiredate1 != null) {
	        	 ps.setDate( 1, Date.valueOf(hiredate1) );
	         }
	         if(deptno1 != null) {
	        	 ps.setInt( 1, Integer.parseInt(deptno1) );
	         }
	         
	         
	        
	         
	         // SQL 실행 및 결과확보 
	         // executeQuery : select문 실행 
	         // ResultSet : select문 조회 결과 전체 : 엑셀처럼 테이블 느낌 
	         ResultSet rs = ps.executeQuery();
	         
	         // 결과 활용 
	         // 한 줄 한 줄 DTO 에 넣기 
	         // 그렇게 만들어진 DTO 를 List 에 넣기 
	         
	         List list = new ArrayList();
	         //  rs.next() : 다음 줄로 커서를 이동한다 
	         // 다음 줄이 있다면 true 를 , 없다면 false 를 돌려줌 
	         // 다음 줄이 있으면 rs 는 다음줄 덩어리 : table 의 tr 한 줄  , 1차원 배열 
	         while( rs.next() ) {
	        	 EmpDTO empDTO = new EmpDTO();
	        	 
	        	 // 이번 줄에서 empno 컬럼의 값을 int로 형변환해서 가져옴 
	        	 int empno = rs.getInt("empno");
	        	 String ename = rs.getString("ename");
	        	 String job = rs.getString("job");
	        	 Date hiredate = rs.getDate("hiredate");
	        	 int deptno = rs.getInt("deptno");
	        	 
	        	 empDTO.setEmpno(empno);
	        	 empDTO.setEname(ename);
	        	 empDTO.setJob(job);
	        	 empDTO.setHireDate(hiredate);
	        	 empDTO.setDeptno(deptno);
	        	 
	        	 list.add(empDTO);
	         }
	         
	         // request 자체는 브라우저에서 서버로 요청한 모든 정보가 있는 곳 
	         // 거기에다 우리 list 도 담아두자 
	         request.setAttribute("list", list);
	         
	         // # JSP 로 forward 보내주기 
	         // forward 방식은 request 도 전달해줌 
	         // 그래서 list 를 request 에 넣었던 것 
	         request.getRequestDispatcher("/WEB-INF/views/empList.jsp").forward(request, response);
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/emp2 doPost 실행");
	}

}
