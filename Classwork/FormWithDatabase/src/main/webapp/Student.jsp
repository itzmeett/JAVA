<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<form name="frm" method="post" action="StudentController" >
		<tr> 
			<td><label>First Name:</label></td>
			<td><input type="text" name="fname"></td>
		</tr>	
		<tr> 
			<td><label>Last Name:</label></td>
			<td><input type="text" name="lname"></td>
		</tr>	
		<tr> 
			<td><label>Email:</label></td>
			<td><input type="text" name="email"></td>
		</tr>	
		<tr> 
			<td><label>Mobile:</label></td>
			<td><input type="number" name="mobile"></td>
		</tr>
		<tr colspan="2">
			<td><input type="submit" name="action" value="Insert"></td>
		</tr>	
	</form>
</table>
</body>
</html>