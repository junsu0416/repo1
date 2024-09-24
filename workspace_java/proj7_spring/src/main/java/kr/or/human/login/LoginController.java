package kr.or.human.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/loginForm.do")
	public ModelAndView loginForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		
		return mav;
		
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req) {
		
		String userID = req.getParameter("userID");
		String userPW = req.getParameter("userPW");
		
		MemberDTO dto = new MemberDTO();
		
		dto.setUserID(userID);
		dto.setUserPW(userPW);
		
		System.out.println(dto);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto" , dto);
		mav.setViewName("result");
		
		return mav;
		
	}
	
	@RequestMapping("/login2")
	public ModelAndView login2(
				
			// String userID = req.getParameter("userID") 과 동일한 동작
			// 기본적으로 필수값으로 변경됨 , 없다면 400 Bad Request 코드 발생
			// required 의 기본값 : true 
			@RequestParam("userID")
			String userID,
			// 만약 parameter 의 key 와 변수명이 같다면 @RequestParam 생략 가능
			// 즉 아래 생략 가능
			@RequestParam(value = "userPW" , required = false)
			String userPW
			
		) {
		
//		String userID = req.getParameter("userID");
//		String userPW = req.getParameter("userPW");
		
		MemberDTO dto = new MemberDTO();
		
		dto.setUserID(userID);
		dto.setUserPW(userPW);
		
		System.out.println(dto);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto" , dto);
		mav.setViewName("result");
		
		return mav;
		
	}
	
	@RequestMapping("/login3")
	public ModelAndView login3(
			// 전달 받은 모든 것을 Map 으로 전환 
			@RequestParam Map user 
		) {
		
		String userID = (String)user.get("userID");
		String userPW = (String)user.get("userPW");
		
		MemberDTO dto = new MemberDTO();
		
		dto.setUserID(userID);
		dto.setUserPW(userPW);
		
		System.out.println(dto);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto" , dto);
		mav.setViewName("result");
		
		return mav;
		
	}
	
	@RequestMapping("/login4")
	public ModelAndView login4(
			// @ModelAttribute : DTO 에 알아서 넣어줌 
//			@ModelAttribute MemberDTO dto2
			
			// request 에 "dto" 라는 key 로 자동완성된 MemberDTO 를 넣어줌
			
//			@ModelAttribute("dto") MemberDTO dto2
			
			// request 에 앞글자만 소문자로 바꾼 "memberDTO" 라는 key 로 넣어줌 
			MemberDTO dto2
		) {
		
		System.out.println(dto2);
		
		ModelAndView mav = new ModelAndView();
//		mav.addObject("dto2" , dto2);
		
		mav.setViewName("result");
		
		return mav;
		
	}
	
	@RequestMapping("login5") 
	public String login5(
				String userID ,
				MemberDTO dto ,
				Model model
 		) {
		System.out.println("login5 실행");
		System.out.println("userID : " + userID);
		System.out.println(dto);
		
		model.addAttribute("userID" , userID); 
		model.addAttribute("dto" , dto);
		
		return "result";
	}
	
	@RequestMapping("result")
	public void login6(MemberDTO memberDTO) {
		// return type 이 void 
		// 또는 return 값이 null 일 때 
		// 주소의 마지막 . 앞의 주소를 
		// viewResolver 로 보냄 
		// 즉 주소.jsp 가 호출된다 
		
		// 그래도 읽기 좋게 명시적으로 
		// return "result"; 해주는 게 좋다 
	}
	

}
