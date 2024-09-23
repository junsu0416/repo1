package emp2.service;

import java.util.List;

import emp2.dao.EmpDAO;
import emp2.dto.EmpDTO;

public class EmpService {
	EmpDAO empDAO = new EmpDAO();
	
	
	public List getEmp(String a) {
		return getEmp(a , "10" , "1");
	}
	
	public List getEmp(String a , String countPerPage , String page) {
		
		EmpDAO empDAO = new EmpDAO();
		
		int cnt = Integer.parseInt(countPerPage);
		int pageNo = Integer.parseInt(page);
		
		// 시작번호 : 이전 페이지까지 보여줬을 거 바로 다음 것
		int start = ((pageNo - 1) * cnt) + 1;
//		int end = pageNo * cnt; 1번째 방법 
		int end = start + cnt - 1;	// 2번째 방법 
		
		List result = empDAO.selectEmp(a , start , end);
		
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
	
	public int update(EmpDTO dto) {
		
		return empDAO.update(dto);
		
	}

}
