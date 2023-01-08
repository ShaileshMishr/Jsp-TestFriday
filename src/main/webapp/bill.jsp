<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bill.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
<title>Bill</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/welcomeServlet" method="post">
<h3>Enter Details for fetch the Bill</h3>
<div class="container">
<fieldset>
<label for="meterID">Meter ID:-</label>
<input type="text" name="meterId" placeholder="Meter ID" ><br><br>
<br><br>
<input id="button1" type="submit" value="Submit Details">
</fieldset>
</div>
</form>
</body>
</html>