<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${uav.uavTitle }</h3>
	<p>${uav.uavContent }</p>
	<p>作者：${uav.uavAuthor }</p>
	<p>创建时间：${uav.uavCreateTime }</p>
	<a href="${ctx }/uav">返回</a>
</body>
</html>