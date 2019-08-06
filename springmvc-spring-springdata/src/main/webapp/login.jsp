<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>登录页面</div>
${msg}
<form action="${pageContext.request.contextPath}/user/login.do" method="post">
	账号：<input name="name" required="required"><br>
	密码：<input type="password" name="password" required="required"><br>
	<button type="submit">登录</button>
</form>
</body>
</html>