package kr.or.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//	Controller Bean ( 즉 spring 이 생성할 수 있는 class ) 으로 등록한다
@Controller
// ip : port/context_path/ human context_path : 프로젝트를 나누는 주소 같은 ?

// class 에 붙은 @RequestMapping은 HandlerMapping 이 처리한다
// ip:port/context_path/sub/**
// 이 클래스에서 반복되는 첫 주소를 한 번에 지정할 때 사용
@RequestMapping("/sub")
public class MainController {
	
	// 메소드에 적용한 @RequestMapping 은 HandlerAdaptor 가 처리한다
	@RequestMapping("/test/main1.do")
	public ModelAndView main1() {
		System.out.println("main1 실행");
		
		// ViewResolver 로 보내는 객체
		ModelAndView mav = new ModelAndView();
		// jsp 의 조합을 위한 이름
		// forward 로 이동하게 됨
		mav.setViewName("main");
		
		// viewName 을 생성자에 넣어도 됨
//		ModelAndView mav = new ModelAndView("main");
		
		return mav;
	}
	
	@RequestMapping("/test/main2.do")
	public ModelAndView main2() {
		System.out.println("main2 실행");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		
		// 마치 request.setAttribute 처럼 담을 수 있는 방법
		mav.addObject("msg" , "현준수");
		
		return mav;
	}
	
	// 전달인자가 value 하나일 때는 value 라는 글씨를 생략할 수 있다 
	// 두 개 이상의 값을 넣을 때는 {} 안에 넣는다 
	// value 는 url 패턴을 뜻한다
	// method 는 접근 방식 제안 함 
	// 		적은 것만 들어올 수 있음 
	// 		method 를 생략하면 모든 방식 허용 
	@RequestMapping(
			value = {"/test/main/*/search" , "/test/main4.do"} , 
			method = { RequestMethod.POST , RequestMethod.GET }
			)
	public ModelAndView main3() {
		System.out.println("main3 실행");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		
		// 마치 request.setAttribute 처럼 담을 수 있는 방법
		mav.addObject("msg" , "main3 메소드 실행");
		
		return mav;
	}
	
	// url 주소가 같으면 안 된다 예외 발생
//	@RequestMapping("/test/main2.do")
//	public ModelAndView main4() {
//		System.out.println("main2 실행");
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("main");
//		
//		// 마치 request.setAttribute 처럼 담을 수 있는 방법
//		mav.addObject("msg" , "현준수");
//		
//		return mav;
//	}
	
//	@RequestMapping( value = "/test/main5.do" , method = RequestMethod.GET) 이거의 축약형이 @GetMapping
	@GetMapping("/test/main5.do")
	public ModelAndView main5() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg" , "현준수");
		
		return mav;
	}
	
//	@RequestMapping( value = "/test/main5.do" , method = RequestMethod.POST) 이거의 축약형이 @PostMapping
	@PostMapping("/test/main5.do")
	public ModelAndView main6() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg" , "현준수");
		
		return mav;
	}
	
//	 @RequestMapping( value = "/test/main5.do" , method = RequestMethod.PUT) 이거의 축약형이 @PutMapping
	 @PutMapping("/test/main5.do")
	public ModelAndView main7() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg" , "현준수");
		
		return mav;
	}
	 
//	 @RequestMapping( value = "/test/main5.do" , method = RequestMethod.PUT) 이거의 축약형이 @DeleteMapping
	 @DeleteMapping("/test/main5.do")
	public ModelAndView main8() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("msg" , "현준수");
		
		return mav;
	}
	
	
}
