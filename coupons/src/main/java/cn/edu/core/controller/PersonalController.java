package cn.edu.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/personal")
public class PersonalController {
	
	/**
	 * 个人中心页面
	 * @return
	 */
	@RequestMapping(value = "/toPersonal.do")
	public String toPersonal(){
		return "personal/personalPage";
	}
}
