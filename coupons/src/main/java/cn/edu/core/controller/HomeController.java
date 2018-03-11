package cn.edu.core.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 * @author huayu
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	/**
	 * 首页优惠券列表
	 */
	@RequestMapping("/toCouponsList.do")
	public String conponsList(HttpServletResponse response){
		return "home/homePage";
	}
}
