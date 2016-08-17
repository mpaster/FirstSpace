<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>录入 - 无人机</title>
</head>
<body>
	
<form action="process" method="post">
	标题：<input type="text" name="uavTitle" /><br />
	类型：<input type="text" name="uavType" /><br />
	内容：<textarea name="uavContent" rows="10" cols="60"></textarea><br />
	作者：<input type="text" name="uavAuthor" /><br />
	<input type="submit" value="add" />
</form>
<a href="${ctx }/uav">返回</a>
</body>
</html>