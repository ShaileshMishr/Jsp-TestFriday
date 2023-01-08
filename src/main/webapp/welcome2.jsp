<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<%@ page import="java.util.List" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electricity Bill</title>
</head>
<body>
<%int prevRead=(int)request.getAttribute("prevRead");
int currRead=(int)request.getAttribute("currRead");
int unit= currRead-prevRead;
String zone=(String)request.getAttribute("zone"); 
if(unit<100){
	if(zone.equals("Urban")){
		int price=unit*6-100;
		request.setAttribute("price", price);
	}
	else{
		int price=unit*4-100;
		request.setAttribute("price", price);
	}
}
else{
	if(zone.equals("Urban")){
		int price=unit*6;
		request.setAttribute("price", price);
	}
	else{
		int price=unit*4;
		request.setAttribute("price", price);
	}
}



%>
<form>
<h1>India Power Corporation Limited</h1><br><br>
<br><br>
<div class="container">
<fieldset>
<c:set var="currdate" value="<%=new java.util.Date() %>"></c:set>

<table>
<h2>Electricity Bill</h2>


</table>
<table id="tables">
<tr>
<th><h3> Meter Id&nbsp;&nbsp; </h3></th>
<th><h3> Current Reading&nbsp;&nbsp; </h3></th>
<th><h3> Previous Reading &nbsp;&nbsp;</h3></th>
<th><h3>  Zone &nbsp;&nbsp;</h3></th>
<th><h3>  Total Unit Consumption &nbsp;&nbsp;</h3></th>
<th><h3>  Total Price &nbsp;&nbsp;</h3></th>
</tr>

<tr>
<td>${meterId}</td>
<td>${currRead}</td>
<td>${prevRead}</td>
<td>${zone}</td>
<td>${currRead-prevRead}</td>
<td>${price}</td>
</tr>


<!-- 
<tr>
<th><h3> -Total Unit Consumption:&nbsp;&nbsp; </h3></th>
<td></td>
<td>${currRead-prevRead}</td>
</tr>
<tr>
<th>Total Price :-</th>
<td>${price}</td>
</tr>
 -->

</table>

</fieldset>
</div>
</form>
</body>
</html>


<style>
 h1{
    text-align: center;
    
    text-shadow: 2px 2px 5px red;
  }
 fieldset{
  	width:50%;
  	align-left:100px;
  	margin:auto;
    display: inline-block;
    text-align:center;
  }
  
  *{
  background-color:  #f1f1f1;
  }
 form{
  text-align:center;
  }
</style>