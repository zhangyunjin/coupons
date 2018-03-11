package cn.edu.core.rest;

import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.core.commons.utils.HttpClientUtils;

@RestController
@RequestMapping(value = "/homeRest")
public class HomeRest {

	private final static Logger logger = LoggerFactory
			.getLogger(HomeRest.class);
	
//	@GetMapping(value = "/getcouponsList.do")
//	public BaseResponse<Object> getcouponsList(){
//		logger.info("请求优惠券列表！");
//		BaseResponse<Object> response = new BaseResponse<Object>();
//		String url = "http://api.tkjidi.com/getGoodsLink?appkey=8c5212551422bfab069e9099da2048bf&type=www_lingquan&page=1";
//		Object returnObj = HttpClientUtils.httpGet(url);
//		response.setData(returnObj);
//		return response;
//	}
	@RequestMapping(value = "/getCouponsList.do")    
    public void getCouponsList(HttpServletResponse response)throws Exception{  
		logger.info("请求优惠券列表！");
		String url = "http://api.tkjidi.com/getGoodsLink?appkey=8c5212551422bfab069e9099da2048bf&type=www_lingquan&page=1";
		Object returnObj = HttpClientUtils.httpGet(url);
		response.setCharacterEncoding("UTF-8");
		if(returnObj != null){
			 response.getWriter().write(returnObj.toString());
		}else{
			response.getWriter().write("timeout");
		}
    }
	
}
