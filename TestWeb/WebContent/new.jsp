<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="whole.css" />     <!-- 전체 기본 스타일 -->
    <link rel="stylesheet" href="topNav.css" />    <!-- 상단 내비게이션 바 스타일 -->
    <link rel="stylesheet" href="sideNav.css" />   <!-- 좌측 내비게이션 바 스타일 -->
    <link rel="stylesheet" href="main.css" />      <!-- main 컨텐츠 삽입부 기본 스타일 -->

    <title>reTuLix</title>
    
<script type="text/javascript"
src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<%-- <script>
<%
	String myctx= request.getContextPath();
	System.out.println(myctx+"2");
%>
</script> --%>

</head><!-- EO-head--------------------------------------------------- -->


<body>
    <div id="wrap">
		<ul class="topNav">
			<li class="topNavLeft"><img src="./images/menu.png" alt="menu"></li>
			<li class="topNavLeft"><img src="./images/sv.png" alt="logo"></li>
			
			<li class="topNavLeft"><a href="#">영화</a></li>
			<li class="topNavLeft"><a href="#">TV프로그램</a></li>
			<li class="topNavSearch">
				<form action="">
					<input type="text" name="search" placeholder="검색어를 입력하세요">
				</form>
			</li>
			<li><img src="./images/menu.png" alt="menu"></li>

			<li class="topNavRight"><a href="#">로그아웃</a></li>
			<li class="topNavRight"><a href="#">내 채널</a></li>
		</ul>
    </div>

    <!-- 좌측바====================================================================== -->
	<div id="wrap">
		<!-- topNav에 가려지는 부분 -->
		<div class="topNavFloor"></div>
		
		<div class="sideNav">
            <!-- 상단 로그인 회원 정보 -->
			<div class="sideNavInfo">
				<span>
					<img src="images/logo_58px.png" alt="회원 이미지" />
				</span>
				<h1>회원 이름</h1>
				<p>일반회원</p>
			</div>

			<!-- 중앙 메뉴 -->
			<div class="sideNavMenu">
				<ul>
					<li><a href="${myctx}/admin.do">
						<span class=""><img src="./images/home.png" alt="">홈</span>
					</a></li>
					<li><a href="#">
						<span class=""><img src="./images/hot.png" alt="">최근 인기 영상</span>
					</a></li>
					<li><a href="#">
						<span class=""><img src="./images/played.png" alt="">최근에 본 영상</span>
					</a></li>
					<li><a href="#">
						<span class=""><img src="./images/subscribe.png" alt="">나중에 볼 영상</span>
					</a></li>
                </ul>
                
                <hr>

                <table class="subscribe">
                    <tr>
                        <td><img src="./images/subscribe.png" alt=""></td>
                        <td>구독 리뷰어A</td>
                    </tr>
                    <tr>
                        <td><img src="./images/subscribe.png" alt=""></td>
                        <td>구독 리뷰어A</td>
                    </tr>
                    <tr>
                        <td><img src="./images/subscribe.png" alt=""></td>
                        <td>구독 리뷰어A</td>
                    </tr>
                    <tr>
                        <td><img src="./images/subscribe.png" alt=""></td>
                        <td>구독 리뷰어A</td>
                    </tr>
                    <tr>
                        <td><img src="./images/subscribe.png" alt=""></td>
                        <td>구독 리뷰어A</td>
                    </tr>
                </table>

			</div>
			
			<!-- 하단 메뉴 -->
			<div class="sideNavBottom">
				<ul>
					<li><button id='imsiAdmin' onclick='imsiAdmin()'>포인트 충전하기</button></li>
				</ul>
			</div>
		</div>

	</div>
    
    <div class="main">

		<!-- 컨텐츠 삽입========================================= -->
        
        <div class="section">
			<jsp:include page='adminMain.jsp'/>

		</div>
        
        <!-- 컨텐츠 삽입========================================= -->
        
	</div>


</body><!-- EO-body--------------------------------------------------- -->

</html>