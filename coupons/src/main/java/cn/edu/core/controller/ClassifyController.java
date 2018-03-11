package cn.edu.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/classify")
public class ClassifyController {

	/**
	 * 分类页面
	 * @return
	 */
	@RequestMapping(value = "/toClassify.do")
	public String toClassify(){
		return "classify/classifyPage";
	}
}
