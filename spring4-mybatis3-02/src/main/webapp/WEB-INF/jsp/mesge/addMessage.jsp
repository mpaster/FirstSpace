<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公共留言 - 给我们留言</title>
<link type="text/css" rel="stylesheet" href="${ctx }/css/else-core.css">
</head>
<body>
	<div class="_inner">
		<form name="form1" action="${ctx }/message/process" method="post">
			姓名：<input type="text" name="mesgeAuthor" />
			<br />内容：<textarea name="mesgeContent" rows="10" cols="60"></textarea>
			<br />联系方式：<input type="text" name="mesgeContact" />
			<input type="submit" onclick="return confirm('确定提交你的评论？')" value="submit" />
		</form>
		<a href="${ctx }/message" >返回</a>&nbsp;<a href="${ctx }">首页</a>
	</div>
</body>
</html>