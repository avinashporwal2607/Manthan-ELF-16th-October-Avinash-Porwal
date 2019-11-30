<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<%if(msg!=null) { %>
<%=msg %>
<%} %>
<fieldset>
<legend>User Login</legend>
<form method='POST' action='./login'>

		<table border="1" align='center'>
			<tr>
				<td>User Name:</td>
				<td><input type='number' name='empid' required></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='pswd' required></td>
			</tr>
			<tr>
				
				<td colspan="3" align="center">
				<input type=submit value='Login'></td>
				<input type="reset" value='reset'>
				<a href=""></a>
			</tr>
		</table>
</form>
</fieldset>	
</body>
</html>