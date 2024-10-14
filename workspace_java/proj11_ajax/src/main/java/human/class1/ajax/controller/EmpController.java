package human.class1.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import human.class1.ajax.dto.EmpDTO;
import human.class1.ajax.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	
	@RequestMapping("/listEmp")
	@ResponseBody
	public List listEmp() {
		
		List list = empService.listEmp();
		System.out.println("list.size() : "+ list.size());
		
		return list;
		
	}
	
	@RequestMapping("/insert")
	public String insertEmp(EmpDTO empDTO) {
		int result = -1;
		System.out.println(empDTO);
		result = empService.insertEmp(empDTO);
		System.out.println("insert 실행 : " + result);
		
		
		return "redirect:emp";
		
	}
	
	@RequestMapping(value = "/update" , method=RequestMethod.POST)
	public String updateEmp(EmpDTO empDTO) {
		int result = -1;
		
		result = empService.updateEmp(empDTO);
		
		System.out.println("update 실행 : " + result);
		System.out.println(empDTO);
		
		return "redirect:emp";
		
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.GET)
	public String update(int empno, Model model) {
		model.addAttribute("cmd" , 2);
		EmpDTO empDetails = empService.listOneEmp(empno);
		model.addAttribute("empDetails", empDetails);
		
		return "empRead";
		
	}
	
	
	@RequestMapping("/empRead")
	public String empRead(@RequestParam("empno") int empno, Model model) {
	    EmpDTO empDetails = empService.listOneEmp(empno);
	    model.addAttribute("empDetails", empDetails);
	    model.addAttribute("cmd" , 1);
	    
	    return "empRead";  
	}
	
	
	@RequestMapping(value="/deleteEmp" , method=RequestMethod.DELETE)
	@ResponseBody
	public int deleteEmp(@RequestBody EmpDTO empDTO) {
		int result = -1;
		System.out.println(empDTO);
		result = empService.deleteEmp(empDTO);
		System.out.println("delete 실행 : " + result);
		
		
		return result;
		
	}
	
	@RequestMapping("/emp")
	public String emp() {
		
		
		return "emp";
		
	}
	
	@RequestMapping("/insertpage")
	public String insert() {
		
		
		return "insert";
		
	}
	

	@RequestMapping("/home1")
	public String home() {
		
		
		return "home";
		
	}

}
