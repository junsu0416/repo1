package human.class1.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import human.class1.ajax.dao.EmpDAO;
import human.class1.ajax.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpDAO empDAO;
	
	
	@Override
	public List listEmp() {
		
//		EmpDAOImpl empDAO = new EmpDAOImpl();
		List list = empDAO.selectEmp();
		
		return list;
	}
	
	@Override
	public EmpDTO listOneEmp(int empno) {
		
//		EmpDAOImpl empDAO = new EmpDAOImpl();
		EmpDTO list = empDAO.selectOneEmp(empno);
		
		return list;
	}
	
	
	@Override
	public int deleteEmp(EmpDTO empDTO) {
		int result = -1;
		result = empDAO.deleteEmp(empDTO);
		
		return result;
	}
	
	@Override
	public int insertEmp(EmpDTO empDTO) {
		int result = -1;
		result = empDAO.insertEmp(empDTO);
		
		return result;
	}
	
	@Override
	public int updateEmp(EmpDTO empDTO) {
		int result = -1;
		result = empDAO.updateEmp(empDTO);
		
		return result;
	}
	

}
