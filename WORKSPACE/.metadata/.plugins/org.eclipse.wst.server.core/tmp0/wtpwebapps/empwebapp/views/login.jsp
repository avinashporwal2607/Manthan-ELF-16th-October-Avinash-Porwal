<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%  String msg=(String)request.getAttribute("msg"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null){ %>
<%= msg %>
<%} %>
<fieldset>
<legend><b>EMPLOYEE LOGIN</b></legend>
	<form action="./login2" method="post">
		<table border='2'>
			<tr>
				<td>emp id</td>
				<td><input type="text" name="emp_id" /></td>
			</tr>

			<tr>
				<td>emp password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			
			<tr>
			<td colspan="3" align="center">
			<input type="submit" value="login">
			</td>
			</tr>
			<tr>
			<td>
			
			<a href="./updateform"> update password</a><br>
			</td>
			</tr>
		</table>
		</form>
		</fieldset>
</body>
</html>