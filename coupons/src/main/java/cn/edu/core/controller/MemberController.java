package cn.edu.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	/**
	 * 会员中心页面
	 */
	@RequestMapping(value = "/toMemberCenter.do")
	public String toMemberCenter(){
		return "member/memberPage";
	}
}
