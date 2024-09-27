package human.class1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/human")
@ResponseBody	// @ResponseBody 를 전체에 적용 시키는 방법
// @RestController = @Controller + @ResponseBody 한 느낌
public class RestController {

	@RequestMapping("/test1")
	public int test1() {
		
		return 100;
	}
	
	@RequestMapping("/test2")
	public String test2() {
		
		return "ajax";
	}
	
	
	
}
