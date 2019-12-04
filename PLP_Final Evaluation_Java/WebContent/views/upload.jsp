<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String DescMessage=(String)request.getAttribute("DescMessage"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>upload resume</title>
</head>

<body style=" background-color:lightsteelblue";>
<a href="views/search.jsp" style="margin-left:1300px;font-size:20px;font-style: oblique;font-family: cursive;" >Search Resume</a>
<h1 style="margin-left:700px;font-family:cursive" >Upload Resume</h1>
	 <form style="margin-left: 700px" action="./uploadfile" method="post" enctype="multipart/form-data">
	
	<h4 style="color:red">choose file to upload</h4>
<input type = "file" name = "choose file" value="choose file" size = "60"  accept="application/msword,application/pdf,"  ><br><br>
	 <input type="submit" value="upload files" style="color: blue"><br><br>
	 <%if(DescMessage!=null && !DescMessage.isEmpty()){ %> 
	<h3 style="color: green;border: 3px;border-style:solid; padding: 20px; margin-right: 350px ;" ><%=DescMessage %></h3>
	
	<%} %>
	</form>
	
	
</body>
</html>