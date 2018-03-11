<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'HomePage.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
	<div>
		<label>商品名称：</label> <span id="goods_name"></span>
	</div>
	<div>
		<label>类别：</label> <span id="cate_name"></span>
	</div>
	<div>
		<label>全价：</label> <span id="price"></span>
	</div>
	<div>
		<label>券后价：</label> <span id="price_after_coupons"></span>
	</div>
</body>
<script src="resources/commons/js/lib/jquery.1.7.2.min.js" type="text/javascript" charset="utf-8"></script>
<script src="resources/home/js/homePage.js" type="text/javascript" charset="utf-8"></script>
</html>
