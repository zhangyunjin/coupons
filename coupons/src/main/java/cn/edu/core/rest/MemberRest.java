package cn.edu.core.rest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/memberRest")
public class MemberRest {

	@RequestMapping(value = "/memberCenter.do")
	public void memberCenter(HttpServletResponse response){
		
	}
}
