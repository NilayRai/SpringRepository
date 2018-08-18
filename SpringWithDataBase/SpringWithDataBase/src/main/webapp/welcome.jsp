<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td align="center" colspan="2"><h1>Data Submitted By Person</h1></td>
		</tr>
		<tr>
			<td>Contact Name</td>
			<td>${personalinformation.name}</td>
		</tr>
		<tr>
			<td>City</td>
			<td>${personalinformation.city}</td>
		</tr>
		<tr>
			<td>Contact Mobile</td>
			<td>${personalinformation.mobileno}</td>
		</tr>

	</table>
	<a href="abc.jlc">Go For New Person Registration</a>
</body>
</html>