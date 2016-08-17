<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页-不开森</title>
<link type="text/css" rel="stylesheet" href="${ctx }/css/mpaster-core.css"></link>
<link type="text/css" rel="stylesheet" href="${ctx }/css/else-core.css">
<link type="text/css" rel="stylesheet" href="${ctx }/css/index.css"></link>
<script type="text/javascript" src="${ctx }/common/jQuery1.11.3.js"></script>
<script type="text/javascript" src="${ctx }/js/slider.js"></script>
</head>
<body>
	<div id="container">
		<!-- header -->
		<div id="header"><%@ include file="header.jsp" %></div>
		<!-- mainContent -->
		<div id="mainContent">
			<div style="min-height:300px;">
				<!-- #slider-box -->
				<div id="slider-box">
					<ul>
				    	<li><img src="${ctx }/img/1.png" /></li>
				        <li><img src="${ctx }/img/2.png" /></li>
				        <li><img src="${ctx }/img/3.png" /></li>
				        <li><img src="${ctx }/img/4.png" /></li>
				        <li><img src="${ctx }/img/5.png" /></li>
				    </ul>
				    <div class="clearBth"></div>
				    <ol>
				    	<li class="active"></li>
				        <li></li>
				        <li></li>
				        <li></li>
				        <li></li>
				    </ol>
				    
				</div><!-- / #slider-box -->
			</div>
			<div id="content-box" class="_inner" style="min-height:100px;">
				<ul>
					<li>
						<div class="li_sub">
							<p><img src="${ctx }/img/iblmsj01880207.jpg" width="360"/></p>
							<p><a href="">让你了解，我的心声</a></p>
						</div>
					</li>
					<li>
						<div class="li_sub">
							<p><img src="${ctx }/img/mf866-03560531.jpg" width="360"/></p>
							<p>板报，我们的故事，都在看</p>
						</div>
					</li>
					<li>
						<div class="li_sub">
							<p><img src="${ctx }/img/mf866-03579194.jpg" width="360"/></p>
							<p>书摘。我们一直需要站在伟人的肩膀前行</p>
						</div>
					</li>
					<li>
						<div class="li_sub">
							<p><img src="${ctx }/img/mf866-03563498.jpg" width="360"/></p>
							<p>分享生活点滴</p>
						</div>
					</li>
					<li>
						<div class="li_sub">
							<p><img src="${ctx }/img/ibljfi00926576.jpg" width="360"/></p>
							<p>本站，网站性质</p>
						</div>
					</li>
					<li>
						<div class="li_sub">
							<a href="${ctx }/message" class="block_alink">
								<p><img src="${ctx }/img/mf866-03558151.jpg" width="360"/></p>
								<p>公共留言。只有你们能看得更清</p>
							</a>
						</div>
					</li>
				</ul>
				<div class="clearBth"></div>
			</div>
		</div><!-- / #mainContent -->
		<!-- footer -->
		<div id="footer"><%@ include file="footer.jsp" %></div>
	</div>
</body>
</html>