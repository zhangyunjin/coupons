package cn.edu.core.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.core.commons.bean.BaseResponse;
import cn.edu.core.commons.url.UrlConstant;
import cn.edu.core.commons.utils.HttpClientUtils;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping(value = "/homeRest")
public class HomeRest {

	/**
	 * 获取优惠券商品列表
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value="/getCouponsList.do")
	public BaseResponse<JSONObject> getCouponsList(){
		BaseResponse<JSONObject> response = new BaseResponse<JSONObject>();
		JSONObject returnObj = HttpClientUtils.httpGet(UrlConstant.URL_COUPONS_LIST);
	    response.setData(returnObj);
	    return response;
	}
		
}
