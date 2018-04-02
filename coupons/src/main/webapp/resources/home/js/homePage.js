/**
 * 初始化
 */
$(document).ready(function() {
	getData();
});
// 获取收文详情
function getData() {
	$.ajax({
		url : "/coupons/homeRest/getCouponsList.do",
		type : 'get',
		dataType : 'JSON',
		success : function(result) {
			if (result == "timeout") {
				alert("请求超时");
				return;
			}
			var data = result.data[0];
			$("#goods_name").html(data.goods_name);
			$("#cate_name").html(data.cate_name);
			$("#price").html(data.price);
			$("#price_after_coupons").html(data.price_after_coupons);
		},
		error : function() {
			alert("失败");
		}
	});
}
