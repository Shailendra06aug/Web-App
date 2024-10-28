<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Registration Form </h1>

<form action="userData">

User Name: <input id="Uname" name="Uname"/><br><br>
EnailId: <input id="EmailId" name="EmailId"/><br><br>
password <input type="password" id="password" name="password"/><br><br>
Gender: <input type="radio" name="Gender" value="1" checked=true/>Male 
        <input type="radio" name="Gender" value="2"/>Female<br>
        <input type="checkbox" name="hobby" value="Dancng">Dancing
        <input type="checkbox" name="hobby" value="Singing">Singing <br><br>
        <input type="submit" value="Register Now"/>


</form>


</body>
</html>