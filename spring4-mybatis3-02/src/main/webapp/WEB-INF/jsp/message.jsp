<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公共留言列表</title>
<link type="text/css" rel="stylesheet" href="${ctx }/css/else-core.css">
</head>
<body>
	<div class="_inner">
		<h3>用户公共留言区</h3>
		<p><a href="${ctx }/message/new">留言</a></p>
		<ul>
			<c:forEach var="mesge" items="${mesges }">
				<li>
					<p>内容：${mesge.mesgeContent }</p>
					<p>作者：${mesge.mesgeAuthor }</p>
					<p>时间：${mesge.mesgeCreateTime }
				</li>
			</c:forEach>
		</ul>
		<a href="${ctx }">首页</a>
	</div>
</body>
</html>