<%@page import="com.manthan.bean.files.ResumeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%ResumeInfoBean DescMessage=(ResumeInfoBean)request.getAttribute("DescMessage"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search resume</title>
</head>
<body bgcolor="lightblue">



<a href="views/upload.jsp" href="/views/download.jsp"style="margin-left:1300px;font-size:20px; large;font-style: oblique;font-family: cursive;">Upload Resume</a>
	<h1 style="margin-left:680px;font-family:cursive " >Search Resume</h1>
	<form  style="margin-left:600px" action="./searchServlet" method="get">

	
	<input type="text" name="search"  required size="60" placeholder="Search Here" > &nbsp <input type="submit" value="search" style="color:green" ><br><br>
	
	</form>
	<%if(DescMessage!=null ){ %> 
	
	
	<b><table border="3" style="color: black;border: 3px;margin-left: 600px ;" ><br></b><br>
	<h2 style="margin-left: 720px;margin-top: 10px;color: green"><b>Search Result are</b></h2>
<tr>
<td >File Name</td>
<td>Name</td>
<td>Email</td>
<td>Download Link</td>
</tr>

 <tr>
 
 <td style="color: darkblue"><%=DescMessage.getFile_name() %> </td>
<td></td>
<td></td>

<td> <a href='./download?path=<%=DescMessage.getFile_name() %>'>Download Link</a></td></tr>


     </table>
	
	
	
	<%} %>
</body>
</html>