<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理用户 - </title>
<script src="${ctx }/common/jQuery1.11.3.js"></script>
<script>
$(document).ready(function(e){
	
})

function deleteUserById(id){
	
}
</script>
</head>
<body>

	<p>管理员，管理用户</p>
	<p><a href="${ctx }/users/new">添加新用户</a></p>
	<table>
		<c:forEach var="user" items="${users }">
			<tr>
				<td>${user.id }</td>
				<td>${user.userName }</td>
				<td>${user.age }</td>
				<td>
					<form name="form${user.id }" action="${ctx }/users/${user.id }" method="post">
						<input type="hidden" name="_method" value="DELETE" />
						<input type="submit" value="删除" onclick="return confirm('确定[${user.userName }]删除？')" />
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="${ctx }">返回首页</a>
	
</body>
</html>