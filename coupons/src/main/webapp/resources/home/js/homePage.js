/**
 * 初始化
 * */
$(document).ready(function() {
	
	getData();
});
//获取收文详情
function getData(){
	 $.ajax({
       url: "http://api.tkjidi.com/getGoodsLink?appkey=8c5212551422bfab069e9099da2048bf&type=www_lingquan&page=1",
       type: 'get',
       dataType: 'JSONP',
       jsonp: "callback",
       success: function(result) {
      		var data = result.data[0];
      		$("#goods_name").html(data.goods_name);
           	$("#cate_name").html(data.cate_name);
      		$("#price").html(data.price);
           	$("#price_after_coupons").html(data.price_after_coupons);
       }
   });
}