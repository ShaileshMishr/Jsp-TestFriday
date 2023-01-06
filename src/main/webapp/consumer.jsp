<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/ConsumerServlet" method="post">
<h3>Enter the Consumer Details</h3>
<label for="meterID">Meter ID:-</label>
<input type="text" name="meterId" placeholder="Meter ID" ><br><br>
<label for="consName">Consumer Name:-</label>
<input type="text" name="consName" placeholder="Consumer Name" ><br><br>
<label for="currRead">Current Reading:-</label>
<input type="text" name="currRead" placeholder="Current Reading" ><br><br>
<label for="prevRead">Previuos Reading:-</label>
<input type="text" name="prevRead" placeholder="Previous Reading" ><br><br>
<label for="zone">Zone :-</label>
<select name="zone" id="zone">
<option value="Rural">Rural</option>
<option value="Urban">Urban</option>
</select><br><br>
<input id="button1" type="submit" value="Submit Details">
</form>

</body>
</html>