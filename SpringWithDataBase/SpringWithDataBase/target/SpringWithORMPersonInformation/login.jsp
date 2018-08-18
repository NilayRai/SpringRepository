<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<spring:form action="addcontact.jlc" method="POST"
		modelAttribute="personalinformation">
		<table align="center">
			<tr>
				<td align="center" colspan="2"><h1>Please provide details
						of personal information</h1></td>
			</tr>

			<tr>
				<td>Contact Name</td>
				<td><spring:input path="name" /></td>
			</tr>


			<tr>
				<td>City</td>
				<td><spring:input path="city" /></td>
			</tr>


			<tr>
				<td>Contact Mobile</td>
				<td><spring:input path="mobileno" /></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit"
					value="Submit"></td>
			</tr>
		</table>
	</spring:form>
</body>
</html>