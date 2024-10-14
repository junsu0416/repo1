package human.class1.ajax.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import human.class1.ajax.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	SqlSession sqlSession;
	

	@Override
	public List selectEmp() {
		List list = sqlSession.selectList("mapper.emp.selectEmp");
		
		
		return list;
	}
	
	@Override
	public EmpDTO selectOneEmp(int empno) {
		EmpDTO list = sqlSession.selectOne("mapper.emp.selectOneEmp" , empno);
		
		
		return list;
	}
	
	
	@Override
	public int deleteEmp(EmpDTO empDTO) {
		int result = -1;
		result = sqlSession.delete("mapper.emp.deleteEmp" , empDTO);
		
		return result;
	}
	
	@Override
	public int insertEmp(EmpDTO empDTO) {
		int result = -1;
		result = sqlSession.insert("mapper.emp.insertEmp" , empDTO);
		
		return result;
	}
	
	@Override
	public int updateEmp(EmpDTO empDTO) {
		int result = -1;
		result = sqlSession.update("mapper.emp.updateEmp" , empDTO);
		
		return result;
	}

}
