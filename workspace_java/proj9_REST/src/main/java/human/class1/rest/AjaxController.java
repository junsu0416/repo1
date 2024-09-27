package human.class1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AjaxController {
	
	/*
	 * 	"/rest/ajax.view" 
	 *  "/rest/ajax"
	 */
	
	@RequestMapping(value = "/ajax.view" , method = RequestMethod.GET)
	public String ajaxView() {
		
		return "ajax";
	}
	
	// @RequestBody : post 로 보낸 json 을 처리 생략은 불가능 생략시 ModelAttribute 로 인식
	@RequestMapping(value = "/ajax" , method = RequestMethod.POST)
	public String ajax(String ename , @ModelAttribute EmpDTO dto2 , @RequestBody EmpDTO dto) {	
		
		System.out.println("ename : " + ename);	// json 으로 보낸 건 @RequestParam 또는 request.getParameter 로 받을 수 없다
		System.out.println("dto : " + dto);
		System.out.println("dto2 : " + dto2);
		
		return "ajax";
	}
	
	@RequestMapping(value = "/ajax/string" , method = RequestMethod.POST)
	@ResponseBody	// @ResponseBody 를 적으면 return "human"; 이걸 string 그대로 전달 
	public String ajaxString(@RequestBody EmpDTO dto) {	
		
		System.out.println("dto : " + dto);
		
		return "human";
	}
	
	@RequestMapping(value = "/ajax/dto" , method = RequestMethod.POST)
	@ResponseBody	
	public EmpDTO ajaxDto(@RequestBody EmpDTO dto) {	
		
		System.out.println("dto : " + dto);
		
		return dto;
	}
	
	@RequestMapping(value = "/ajax/list" , method = RequestMethod.POST)
	@ResponseBody	
	public List ajaxList(@RequestBody EmpDTO dto) {	
		
		System.out.println("dto : " + dto);
		
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		return list;
	}
	
	@RequestMapping(value = "/ajax/forward" , method = RequestMethod.GET)
	public String ajaxForward() {
		
		return "forward:/ajax.view";	// 주소는 forward 이지만 실제로 가는 곳은 ajax.view 이고 
	}
	
	@RequestMapping(value = "/ajax/redirect" , method = RequestMethod.GET)
	public String ajaxRedirect() {
		
		return "redirect:/ajax.view";	// redirect 를 치고 간다면 실제 주소가 ajax.view 로 바뀐다
	}
	
	@RequestMapping("/ajax/notice/{num}/static/{str}")
	@ResponseBody
	public int notice(@PathVariable("num") int number , @PathVariable("str") String str1 , HttpServletRequest request) {
		
		System.out.println(request.getParameter("num"));
		System.out.println("number : "+ number);
		System.out.println("str1 : "+ str1);
		
		return number;
	}

	

}
