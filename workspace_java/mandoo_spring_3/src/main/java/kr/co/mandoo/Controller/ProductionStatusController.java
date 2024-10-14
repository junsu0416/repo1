package kr.co.mandoo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mandoo.Service.ProductionStatusService;

@Controller
public class ProductionStatusController {
	
	@Autowired
	ProductionStatusService pss;
	
	@RequestMapping("/ProductionStatusRead")
	public String productionStatus(Model model) {
		
		List list = pss.StatusListService();
		System.out.println( " Controller에서 list 뽑아오기 : " + list);
		model.addAttribute("list", list);
		
		return "ProductionStatusRead";
		
	}

}
