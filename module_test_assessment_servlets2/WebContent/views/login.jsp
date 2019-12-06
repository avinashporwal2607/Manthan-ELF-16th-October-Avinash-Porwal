<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%  String userinfobean=(String)request.getAttribute("u"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(userinfobean!=null){ %>
<%= userinfobean %>
<%} %>
<fieldset>
<legend>User login</legend>
	<form action="./login22" method="post">
		<table border='2'>
			<tr>
				<td>user email</td>
				<td><input type="text" name="Email" /></td>
			</tr>

			<tr>
				<td>password</td>
				<td><input type="password" name="Password" /></td>
			</tr>
			
			<tr>
			<td colspan="3" align="center">
			<input type="submit" value="login">
			</td>
			</tr>
			<tr>
			
			</tr>
		</table>
		</form>
		</fieldset>
</body>
</html>