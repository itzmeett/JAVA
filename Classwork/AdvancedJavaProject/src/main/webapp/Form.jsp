<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function checkfname(){
		var f = document.insert.fname.value;
		var reg = /^[A-Za-z]+$/;
		if(f == ""){
			document.getElementById("fnameError").innerHTML = "Please Enter Your First Name";
		}else if(!reg.test(f)){
			document.getElementById("fnameError").innerHTML = "Please Enter a Valid First Name";
		}else{
			document.getElementById("fnameError").innerHTML = "";
		}
	}
	function checklname(){
		var f = document.insert.lname.value;
		var reg = /^[A-Za-z]+$/;
		if(f == ""){
			document.getElementById("lnameError").innerHTML = "Please Enter Your Last Name";
		}else if(!reg.test(f)){
			document.getElementById("lnameError").innerHTML = "Please Enter a Valid Last Name";
		}else{
			document.getElementById("lnameError").innerHTML = "";
		}
	}
	function checkEmail(){
		var f = document.insert.email.value;
		var reg = /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;
		if(f == ""){
			document.getElementById("emailError").innerHTML = "Please Enter Email";
		}else if(!reg.test(f)){
			document.getElementById("emailError").innerHTML = "Please Enter a Valid Email";
		}else{
			document.getElementById("emailError").innerHTML = "";
		}
	}
	function checkMobile(){
		var f = document.insert.mobile.value;
		var reg = /^\d{10}$/;
		if(f == ""){
			document.getElementById("mobileError").innerHTML = "Please Enter Mobile Number";
		}else if(!reg.test(f)){
			document.getElementById("mobileError").innerHTML = "Please Enter a 10 digit Number";
		}else{
			document.getElementById("mobileError").innerHTML = "";
		}
	}
	function checkPassword(){
		var f = document.insert.password.value;
		var reg = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
		if(f == ""){
			document.getElementById("passwordError").innerHTML = "Please Enter Password";
		}else if(!reg.test(f)){
			document.getElementById("passwordError").innerHTML = "Please Enter a minimum 1 upper, lower, number & special character(8-15)";
		}else{
			document.getElementById("passwordError").innerHTML = "";
		}
	}
	function checkCPassword(){
		var p1 = document.insert.password.value;
		var p2 = document.insert.cpassword.value;
		if(p1 == ""){
			document.getElementById("cPasswordError").innerHTML = "Please Enter Password First";
		} else if(p1 != p2){
			document.getElementById("cPasswordError").innerHTML = "Password & Confirm Password do not match";
		} else {
			document.getElementById("cPasswordError").innerHTML = "";
		}
	}
</script>
</head>
<body>
	<form name="insert" action="" method="post">
	<table>
		<tr> 
			<td>First Name:</td>
			<td><input type="text" name="fname" onblur="checkfname();"></td>
			<td><span id="fnameError"></span></td>
		</tr>		
		<tr> 
			<td>Last Name:</td>
			<td><input type="text" name="lname" onblur="checklname();"></td>
			<td><span id="lnameError"></span></td>
		</tr>	
		<tr> 
			<td>Email:</td>
			<td><input type="text" name="email" onblur="checkEmail();"></td>
			<td><span id="emailError"></span></td>
		</tr>
		<tr> 
			<td>Mobile:</td>
			<td><input type="text" name="mobile" onblur="checkMobile();"></td>
			<td><span id="mobileError"></span></td>
		</tr>
		<tr> 
			<td>Address:</td>
			<td><textarea rows="5" cols="21" name="address"></textarea></td>
		</tr>	
		<tr>
			<td>Gender:</td>
			<td>
				<input type="radio" name="gender" value="male">Male<br>
				<input type="radio" name="gender" value="female">Female
			</td>
		</tr>
		<tr>
			<td>Education:</td>
			<td>
				<select name="education">
					<option>---Select Option</option>
					<option value="10th">10th</option>
					<option value="12th">12th</option>
					<option value="BE">BE</option>
					<option value="ME">ME</option>
					<option value="BCA">BCA</option>
					<option value="MCA">MCA</option>
					<option value="B.TECH">B.TECH</option>
					<option value="M.TECH">M.TECH</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Hobby:</td>
			<td>
				<input type="checkbox" name="hobby" value="cricket">Cricket<br>
				<input type="checkbox" name="hobby" value="football">Football<br>
				<input type="checkbox" name="hobby" value="music">Music<br>
				<input type="checkbox" name="hobby" value="reading">Reading<br>
				<input type="checkbox" name="hobby" value="travelling">Travelling<br>
			</td>
		</tr>
		<tr>
			<td>Birth Date:</td>
			<td><input type="date" name="bdate"></td>
		</tr>
		<tr>
			<td>Birth Time:</td>
			<td><input type="time" name="btime"></td>
		</tr>
		<tr>
			<td>Resume:</td>
			<td><input type="file" name="resume"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="password" onblur="checkPassword();"></td>
			<td><span id="passwordError"></span></td>
		</tr>
		<tr>
			<td>Confirm Password:</td>
			<td><input type="password" name="cpassword" onblur="checkCPassword();"></td>
			<td><span id="cPasswordError"></span></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" name="submit" value="SUBMIT"></td>
		</tr>
	</table>
	</form>
</body>
</html>
