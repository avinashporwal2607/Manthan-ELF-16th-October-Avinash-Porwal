<%@page import="com.manthan.files.bean.ProductInfoBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%ProductInfoBean p=(ProductInfoBean)request.getAttribute("searchproduct"); 
    
    String msg=(String)request.getAttribute("msg");
    
    
    %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>search Product</legend>
		<form action="./searchproduct" method="get">
			PRODUCT id: <input type="text" name="Product_ID" required><br>
			<br> <input type="submit" value="search">


		</form>


	</fieldset>

	<%if(msg!=null && !msg.isEmpty()){ %>
	<h3 style="color: red"><%=msg %></h3>

	<%} %>

	<%if( p!=null){ %>

	<table>
		<tr>
			<td>PRODUCT id</td>
			<td>:</td>
			<td><%=p.getProduct_id() %></td>
		</tr>

		<tr>
			<td>PRODUCT name</td>
			<td>:</td>
			<td><%=p.getProduct_name() %></td>
		</tr>




		<tr>
			<td>Product cost</td>
			<td>:</td>
			<td><%=p.getProduct_cost() %></td>
		</tr>


		<tr>
			<td>PRODUCT COLOR</td>
			<td>:</td>
			<td><%=p.getProduct_color() %></td>
		</tr>


		<tr>
			<td>description</td>
			<td>:</td>
			<td><%=p.getDescription() %></td>
		</tr>
		<tr>
			<td>no of product</td>
			<td>:</td>
			<td><%=p.getNumber_of_product() %></td>
		</tr>




	</table>
	<%} %>

</body>
</html>