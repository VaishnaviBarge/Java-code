<%@page import="bank.model.Register"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>

<style>
@charset "UTF-8";
@import url("https://fonts.googleapis.com/css2?family=Open+Sans&family=Raleway:wght@400;700&display=swap");

* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  font-family: "Open Sans", sans-serif;
}

body {
  margin: 0;
  padding: 0;
}

.container {
  width: 1200px;
  max-width: 100%;
  margin: 0 auto;
  padding: 50px 0;
}

a {
  text-decoration: none;
}

nav {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px solid black;
}

nav a img {
  width: 200px;
}

nav ul {
  display: flex;
}

nav li {
  list-style: none;
  margin: 0 25px;
}

nav ul li a {
  color: #372cfa;
  font-size: 20px;
}

nav ul li a:hover {
  text-decoration: underline;
}

h1 {
  text-align: center;
  color: #333;
}

.profile-info p {
  margin: 10px 0;
}

.go-to-dashboard {
  display: block;
  text-align: center;
  color: #fff;
  background-color: #372cfa; /* Corrected background color */
  padding: 10px 20px;
  border-radius: 4px;
  text-decoration: none;
  margin-top: 20px;
}

.go-to-dashboard:hover {
  background-color: #45a049;
}
	
</style>
</head>
<body>
	<header class="container">
			<nav>
				<a href="DashboardView.jsp"><img src="./images/logo.png"
					alt="logo" /></a>
				<ul>
					<li><a href="DashboardView.jsp">Dashboard</a></li>
					<li><a href="ProfileView.jsp">Profile</a></li>
					<li><a href="login.jsp">Log Out</a></li>
				</ul>
			</nav>
		</header>
	<div class="container">
		<%
            Register r = (Register)session.getAttribute("loginInfo"); 
        %>

	
		<h1>My Profile</h1>
		<%
					String sucessMessagePass = (String) request.getAttribute("sucessMessagePass");
					if (sucessMessagePass != null) {
					%>
					<p style="color: green; text-align: center; font-size:20px;"><%=sucessMessagePass%></p>
					<%
					}
					%>
		<div class="profile-info">
			<p>
				<strong>First Name:</strong>
				<%= r.getfName() %></p>
			<p>
				<strong>Last Name:</strong>
				<%= r.getlName() %></p>
			<p>
				<strong>Account Number:</strong>
				<%= r.getAccNo() %></p>
			<p>
				<strong>Account Balance:</strong>
				<%= r.getAccBal() %></p>
			<p>
				<strong>User Name:</strong>
				<%= r.getUname() %></p>
			<div>
				Change Password <a href="ChangePasswordView.jsp">Click Here</a>
			</div>
		</div>

		<a href="DashboardView.jsp" class="go-to-dashboard">Go to
			Dashboard</a>
	</div>
</body>
</html>
