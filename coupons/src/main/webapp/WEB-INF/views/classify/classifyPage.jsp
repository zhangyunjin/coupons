<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'classifyPage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
  	<div>
		<input id="sousuo"><a href = "http://api.tkjidi.com/getGoodsLink?appkey=8c5212551422bfab069e9099da2048bf&type=so&keyword=玩具">搜索</a>
	</div>
	<div>
		<label>商品类别：</label> <span id="classname"></span>
	</div>
</body>
<script src="resources/commons/js/lib/jquery.1.7.2.min.js" type="text/javascript" charset="utf-8"></script>
<script src="resources/classify/js/classifyPage.js" type="text/javascript" charset="utf-8"></script>
</html>