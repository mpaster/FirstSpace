var iNow = 0;
var iNow2 = 0;
var timer = null;
$(document).ready(function(){
	//触发
	var oneHeight = $("#slider-box ul li").height();
	$("#slider-box ol li").click(function(){
		//记录下触发的索引
		iNow2 = $("#slider-box ol li").index($(this));
		$("#slider-box ol li").each(function(){
			$(this).removeClass("active");
		});
		
		$(this).addClass("active");
		$("#slider-box ul").animate({top:-oneHeight*iNow2},"normal");
		iNow = iNow2;
	});
	//鼠标移入停止
	$("#slider-box").mouseover(function(){
		clearTimeout(timer);
	});
	$("#slider-box").mouseout(function(){
		timer = setInterval(toShow, 5000);
	});
	timer = setInterval(toShow, 5000);
});
function toShow(){
	var oneHeight = $("#slider-box ul li").height();
	if(iNow < $("#slider-box ol li").size()-1){
		iNow++;
	}
	else{
		iNow = 1;
	}
	$("#slider-box ol li").each(function(){
		$(this).removeClass("active");
	});
	$("#slider-box ol li").eq(iNow).addClass("active");
	$("#slider-box ul").animate({top:-oneHeight*iNow},"mormal");
}