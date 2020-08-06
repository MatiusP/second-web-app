<%@ page language="java" import="by.protsko.webapp.entity.User"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="user" class="by.protsko.webapp.entity.User"
		scope="request" />

	<h1>User info</h1>
	<form action="index.jsp" >
		User first name:
		<jsp:getProperty property="firstName" name="user" />
		<br /> User last name:
		<jsp:getProperty property="lastName" name="user" />
		<br /> User year of birth:
		<jsp:getProperty property="yearOfBirth" name="user" />
		<br /> User e-mail:
		<jsp:getProperty property="eMail" name="user" />
		<br /> User city:
		<jsp:getProperty property="address" name="user" />
		<br />
		
		<input type="submit" name="back to welcom page" value="press me">
	</form>
	
	

</body>
</html>