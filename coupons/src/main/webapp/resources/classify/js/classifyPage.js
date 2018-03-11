/**
 * 初始化
 * */
$(document).ready(function() {
	getData();
});
//获取收文详情
function getData(){
	 $.ajax({
       url: "/coupons/classifyRest/getClassify.do",
       type: 'get',
       dataType: 'JSON',
       success: function(result) {
    	   if(result == "timeout"){
    		   alert("请求超时");
    		   return;
    	   }
    	   var data = result.data;
    		  $("#classname").html(data[0].classname);
       }
   });
}