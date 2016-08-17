<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功 - 留言成功</title>
</head>
<body>
<h3>留言成功！</h3>
<p>你的留言将会在公共留言区被所有人浏览</p>
<a href="${ctx }/message/new">继续添加</a>
<a href="${ctx }">返回首页</a>
<a href="<%=request.getContextPath()%>">返回首页2</a>

</body>
</html>