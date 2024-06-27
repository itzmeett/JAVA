<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" method="post" action="UsersController">
	<table >
		<tr>
			<td>First Name :</td>
			<td><input type="text" name="fname"></td>
		</tr>
		<tr>
			<td>Last Name :</td>
			<td><input type="text" name="lname"></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<td>Mobile :</td>
			<td><input type="number" name="mobile"></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><input type="password" name="pswd"></td>
		</tr>
		<tr>
			<td>Confirm Password :</td>
			<td><input type="password" name="cpswd"></td>
		</tr>
		<tr>
			<td><input type="submit" name="action" value="Submit"> </td>
		</tr>
	</table>
	</form>
</body>
</html>