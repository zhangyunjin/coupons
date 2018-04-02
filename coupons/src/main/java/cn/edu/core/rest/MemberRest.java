package cn.edu.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.edu.core.bean.Member;
import cn.edu.core.commons.bean.BaseResponse;
import cn.edu.core.commons.url.UrlConstant;
import cn.edu.core.commons.utils.HttpClientUtils;
import cn.edu.core.service.MemberService;

@RestController
@RequestMapping(value = "/memberRest")
public class MemberRest {

	@Autowired
	private MemberService memberService;
	
	/**
	 * 获取会员信息
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@GetMapping(value="/getMemberInfo.do")
	public BaseResponse<Member> getCouponsList(){
		BaseResponse<Member> response = new BaseResponse<Member>();
		String userId = null;
		Member member = memberService.getMemberInfo(userId);
	    response.setData(member);
	    return response;
	}
}
