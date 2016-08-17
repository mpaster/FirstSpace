<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新用户</title>
</head>
<body>
	<form action="${ctx }/new/process" method="post">
		<input type="text" name="userName" value="张三" />
		<input type="password" name="password" value="123456" />
		<input type="text" name="age" value="20" />
		<input type="submit" value="submit" />
	</form>
	<a href="${ctx }/users">返回用户管理</a>
	<a href="${ctx }">返回首页</a>
</body>
</html>