<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="consumer.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
<title>Insert title here</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/InsertData" method="post">
<h3>Enter the Consumer Details</h3>
<div class="container">
<fieldset>
<label for="meterID">Meter ID:-</label>
<input type="text" name="id" placeholder="Meter ID" ><br><br>

<label for="currRead">Current Reading:-</label>
<input type="text" name="cur" placeholder="Current Reading" ><br><br>
<label for="prevRead">Previuos Reading:-</label>
<input type="text" name="pre" placeholder="Previous Reading" ><br><br>
<label for="zone">Zone :-</label>
<select name="zone" id="zone">
<option value="Rural">Rural</option>
<option value="Urban">Urban</option>
</select><br><br>
<input id="button1" type="submit" value="Submit Details">
</fieldset>
</div>
</form>

</body>
</html>