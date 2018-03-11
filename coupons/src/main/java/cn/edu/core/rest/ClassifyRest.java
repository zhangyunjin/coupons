package cn.edu.core.rest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.core.commons.utils.HttpClientUtils;

@RestController
@RequestMapping(value = "/classifyRest")
public class ClassifyRest {

	@RequestMapping(value = "/getClassify.do")    
    public void getClassify(HttpServletResponse response)throws Exception{  
		String url = "http://api.tkjidi.com/classList?appkey=8c5212551422bfab069e9099da2048bf";
		Object returnObj = HttpClientUtils.httpGet(url);
		response.setCharacterEncoding("UTF-8");
		if(returnObj != null){
			 response.getWriter().write(returnObj.toString());
		}else{
			response.getWriter().write("timeout");
		}
    }
	
}
