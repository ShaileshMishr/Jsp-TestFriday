<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/BillFilter" method="post">
<h3>Enter Details for fetch the Bill</h3>
<label for="meterID">Meter ID:-</label>
<input type="text" name="meterId" placeholder="Meter ID" ><br><br>
<br><br>
<input id="button1" type="submit" value="Submit Details">
</form>
</body>
</html>