$(function() {

	var flag=true;

	$("#menuToggle").on("click", function(){
		if(flag==true){
			//$(".sideNav").fadeOut();
			$(".sideNav").animate({left:"-=250"},100);

			$(".main").animate({
				marginLeft:"-=250px"
			},30)
			flag=false;
		} else {
			//$(".sideNav").fadeIn();
			$(".sideNav").animate({left:"+=250"},100);

			$(".main").animate({
				marginLeft:"+=250px"
			},30)
			flag=true;
		}
	})
	
});

 /* 구독리스트 숨기기 */
 $(function(){
    $('.moreSub').hide();
    $('.more').click(function () {
        if ($(".moreSub").is(":hidden")) {
             $(".moreSub").show("slow"); 
        }else { $(".moreSub").slideUp();
     } 
    });

}); 	