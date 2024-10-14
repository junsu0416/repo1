package human.class1.ajax.dao;

import java.util.List;

import human.class1.ajax.dto.EmpDTO;

public interface EmpDAO {
	
	List selectEmp();
	EmpDTO selectOneEmp(int empno);
	int deleteEmp(EmpDTO empDTO);
	int	insertEmp(EmpDTO empDTO);
	int	updateEmp(EmpDTO empDTO);
	


}
