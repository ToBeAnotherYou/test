<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h4 style="color: red">登录</h4></center>
	<form action="${pageContext.request.contextPath}/LoginControlServlet" method="post">
		<table align="center" style="border: 2px;border-collapse: collapse;">
			<tr>
				<td>账号:</td>
				<td><input type="text" name="uName"/></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="pWd"/></td>
			</tr>
			<tr align="center">
				<td><input type="submit" value="登录"></td>&nbsp;
				<td><input type="reset" value="重置" /></td>
			</tr>
			<tr>
				<td colspan="2"><a href="#">[如果没有账号点击注册]</a></td>
			</tr>
		</table>
	</form>
</body>
</html>