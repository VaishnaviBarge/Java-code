<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.container {
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
}

.container h2 {
	text-align: center;
	margin-bottom: 20px;
	color: #298AC2;
}

.form-group {
	margin-bottom: 15px;
}

.form-group label {
	display: block;
	margin-bottom: 5px;
	color: #333;
}

.form-group input[type="password"] {
	width: calc(100% - 22px); /* Adjusted width for padding */
	padding: 10px; /* Increased padding for better visual balance */
	font-size: 14px;
	border: 1px solid #ccc;
	border-radius: 3px;
	box-sizing: border-box;
	/* Ensures padding is included in the width calculation */
}

.form-group input[type="submit"] {
	width: 100%;
	padding: 10px;
	background-color: #298AC2;
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	font-size: 16px;
	transition: background-color 0.3s ease;
}

.form-group input[type="submit"]:hover {
	background-color: #1e70b8;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Change Password</h2>
		<%
					String errorMessagePass = (String) request.getAttribute("errorMessagePass");
					if (errorMessagePass != null) {
					%>
		<p style="color: red; text-align: center;"><%=errorMessagePass%></p>
		<%
					}
					%>
		<form action="ForgetPasswordController" method="post">
			<div class="form-group">
				<label for="oldPass">Enter Old Password:</label> <input
					type="password" id="oldPass" name="oldPass" required>
			</div>
			<div class="form-group">
				<label for="newPass">Enter New Password:</label> <input
					type="password" id="newPass" name="newPass" required>
			</div>
			<div class="form-group">
				<input type="submit" value="Change Password">
			</div>
		</form>
	</div>
</body>
</html>
