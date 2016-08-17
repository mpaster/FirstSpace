<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无人机 | unmanned aerial vehicles</title>
</head>
<body>

<a href="${ctx }/uav/new">普通用户新增条目</a>

<table>
	<c:forEach var="uav" items="${uavs }">
	<tr>
		<td>${uav.uavId }</td>
		<td><a href="${ctx }/uav/${uav.uavId }">${uav.uavTitle }</a></td>
		<td>${uav.uavAuthor }</td>
	</tr>
	</c:forEach>
</table>

<a href="${ctx }/">返回首页</a>
</body>
</html>