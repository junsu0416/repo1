package emp2.service;

import java.util.List;

import emp2.dao.EmpDAO;
import emp2.dto.EmpDTO;

public class EmpService {
	EmpDAO empDAO = new EmpDAO();
	
	public List getEmp(String a) {
		
		EmpDAO empDAO = new EmpDAO();
		
		List result = empDAO.selectEmp(a);
		
		return result;
		
	}
	
	public int joinEmp(EmpDTO dto) {
		
		
		int insertCount = this.empDAO.insertEmp(dto);
		return insertCount;
		
	}
	
	public EmpDTO get(int empno) {
		EmpDTO empDTO = new EmpDTO();
		EmpDAO empDAO = new EmpDAO();
		
		empDTO = empDAO.selectOne(empno);
		
		return empDTO;
		
	}

}
