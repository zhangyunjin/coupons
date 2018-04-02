package cn.edu.core.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.edu.core.commons.bean.BaseResponse;
import cn.edu.core.commons.url.UrlConstant;
import cn.edu.core.commons.utils.HttpClientUtils;

@RestController
@RequestMapping(value = "/classifyRest")
public class ClassifyRest {

	/**
	 * 获取优惠券商品分类
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value="/getClassify.do")
	public BaseResponse<JSONObject> getCouponsList(){
		BaseResponse<JSONObject> response = new BaseResponse<JSONObject>();
		JSONObject returnObj = HttpClientUtils.httpGet(UrlConstant.URL_COUPON_CLASSIFY);
	    response.setData(returnObj);
	    return response;
	}
	
}
