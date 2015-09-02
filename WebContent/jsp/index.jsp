<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form</title>
</head>
<body>
	<form:form commandName="StudentBeans" name="StudentBeans" method="post">

		<table>
			<tr>
				<td>Id</td>
				<td><form:input path="StudentBeans.id" /></td>
			</tr>
			<tr>
				<td>first name</td>
				<td><form:input path="fname" /></td>
			</tr>
			<tr>
				<td>medal name</td>
				<td><form:input path="mname" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" name="login"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>