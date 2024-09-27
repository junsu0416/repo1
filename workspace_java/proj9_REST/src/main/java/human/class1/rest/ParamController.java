package human.class1.rest;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller					 // 컨트롤러 클래스에 붙여서 Bean 으로 등록
	
//@Controller("beanID") bean id 를 지정하는 방법 / bean id 를 지정하지 않으면 class 명의 앞글자가 소문자인 bean id 가 자동 지정 
											 // 그래서 지금은 "paramController" 로 지정됨 

@ResponseBody 				// 이 class 의 모든 메소드에 ResponseBody 를 붙여줌 
							// @RestController @Controller + @ResponseBody / 이 두 개의 역할을 한 번에 해주는 

@RequestMapping("/human/a") // 주소 앞에 공통으로 적용 
				// - 이 주소로 클래스까지 들어옴 (HandlerMapping)
				// 그리고 나머지 주소고 메소드 찾아감 ( HandlerAdaptor )
public class ParamController {
	
//	@Autowired	// 이 type 의 변수에 넣을 수 있는 
				// 동일한 class 나 자동 형변환 되는 class 를 찾아서 
				// 생성해주며 (IoC) 변수에 넣어준다 (DI)
	// 만약 후보 클래스가 2개 이상 있다면 
	// @Primary 가 붙은 class 가 온다 
	// @Primary 가 없다면 @Qualifier("bean id") 로 특정 bean 을 지정할 수 있다 
//	EmpService empService;
	
	
	@RequestMapping(	// 각 값이 두 개 이상인 경우 {} 로 묶는다
			value = {"/test" , "/test{key}"},					// 연결되는 주소
			method = {RequestMethod.GET , RequestMethod.PUT}	// 허용하는 method 
			)													// 없다면 모두 허용한다 
	
	@ResponseBody // 여기에 붙인다면 이 메소드만 , 위에다가 붙인다면 공통으로 / json 또는 기본타입을 돌려줌 
	public EmpDTO paramTest(
			HttpServletRequest request , 
			HttpServletResponse response , 
			Model model ,
			
			@RequestParam(value = "id" , required = true) String id1 , 
			// String id = request.getParameter("id") 에 해당 
			// required 는 기본값이 true 라서 생략하면 필수 전달인자가 됨 
			// 필수일 때 null 인 경우 400 Bad Request 발생 
			// @RequestParam 을 생략하면 
			
			// parameter 의 key 가 변수명과 동일하고 필수가 아닌 경우 
			// @RequestParam 생략 가능 
			// @RequestParam(value = "pw" , required = false) String pw 
			String pw ,
			
			@RequestParam Map map , // 모든 parameter 를 key , value 로 map 에 넣어줌 
			
			@ModelAttribute EmpDTO dto1 , // getParameter 로 꺼내서 필드에 set 해서 넣어줌 
			/*
			 * @ModelAttribute 의 역할
			 * String ename = request.getParameter("ename")
			 * EmpDTO empDTO = new EmpDTO();
			 * empDTO.setEname(ename); 이런걸 자동으로 해준다
			 */
			@ModelAttribute("dto3") EmpDTO dto2 ,
			// 어짜피 dto2 를 model 에 dto3 라고 넣는 경우 
			// 즉 , model.addAttribute("dto3" , dto2)를 한 번에 해줌
			
			// model 에 넣는 key 를 class 명의 앞글자를 소문자로 하는 경우 생략 가능
			// @ModelAttribute("empDTO")
			EmpDTO dto5 ,
			
			@RequestBody EmpDTO dto6 ,	// post , put , delete 등으로 넘어온 json 을 분석해서 dto6 에 넣어줌 
			
			@PathVariable("key") String name // 주소 중 {key} 영역의 값을 name 에 할당
			
			
			) {
		
		return null;
	}

}
