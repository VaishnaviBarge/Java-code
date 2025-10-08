<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electricity Bill</title>
<style>
* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body {
   background-color: #f4f4f4;
    display: flex;
    flex-direction: column;
    
    align-items: center;
    height: 100vh;
}

.container {
  margin-top: 20px;
  width: 100%;
  padding:0 100px 0 100px;
  max-width: 100%;
  margin: 30px auto;
  
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
  align-items: center; /* This centers the list items vertically */
}

nav li {
  list-style: none;
  margin: 0 25px;
}

nav ul li a {
  color: #298AC2;
  font-size: 20px;
}

nav ul li a:hover {
  text-decoration: underline;
}

.logout-btn{
	
  background-color: rgb(255, 0, 0);
  color: white;
  border: none;
  padding: 10px 10px;
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px;
  text-align: center;
  display: inline-block;
  text-decoration: none;
  margin-bottom: 10px;

}

.container1 {
	border: 1px solid black;
	width: 700px;
	text-align: center;
	border-radius: 10px;
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.5);
	padding: 20px;
	background-color: rgb(245, 248, 250);
	display: flex;
	align-items: center;
	justify-content: space-between;
}

.form-container {
	width: 60%;
}

.header {
	margin-bottom: 20px;
}

label {
	display: block;
	margin-bottom: 10px;
	margin-top: 5px;
	font-size: 20px;
}

input, select {
	width: 100%;
	padding: 10px;
	margin-bottom: 13px;
	border-radius: 5px;
}
/* button {
    width: 120px;
    padding: 5px;
    font-size: 20px;
    background-color: rgb(238, 202, 222);
    border-radius: 5px;
    margin-bottom: 15px;
    margin-top: 15px;
} */
button, .payment input[type="submit"] {
	width: 50%;
	padding: 10px;
	font-size: 20px;
	background-color: rgb(68, 85, 247);
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s ease, transform 0.3s ease;
}

button:hover, .payment input[type="submit"]:hover {
	background-color: rgb(50, 70, 190);
	transform: scale(1.05);
}

button:active, .payment input[type="submit"]:active {
	background-color: rgb(35, 55, 150);
}

img {
	width: 35%;
	height: auto;
	border-radius: 10px;
}
</style>
</head>
<body>

<div class="container">
<nav>
      <a href="DashboardView.jsp"><img src="./images/logo.png" alt="logo" /></a>
      <ul>
        <li><a href="DashboardView.jsp">Dashboard</a></li>
        <li><a href="ProfileView.jsp">Profile</a></li>
        <li><a class="logout-btn" href="login.jsp">Log Out</a></li>
      </ul>
    </nav>
</div>

	<div class="container1">
		<div class="form-container">
			<div class="header">
				<h1>Electricity Bill</h1>
			</div>
			<%
					String errorMessage = (String) request.getAttribute("errorMessage");
					if (errorMessage != null) {
					%>
			<p style="color: red; font-size: 25px; text-align: center;"><%=errorMessage%></p>
			<%
					}
					%>
			<form action="ElectricityController">
				<div class="Acc-no">
					<label for="id">Consumer No :</label> 
					<input type="text"
						name="accNo" placeholder="Enter Consumer Number" required maxlength="10" pattern="\d{10}" title="Consumer number must be 10 digits"  >
				</div>
				<div class="ele-b">
					<label for="ele-board"> Electricity Board :</label> <select
						name="eleBoard" id="Electricity Board" required>
						
						<option value="Adani Electricity">Adani Electricity</option>
						<option
							value="BrihanmumbaiElectricity supply Transport Undertaking">Brihanmumbai
							Electricity supply Transport Undertaking</option>
						<option value="MSEDCL Electricity">MSEDCL Electricity</option>
						<option value="TATA Power-Mumbai Electricity">TATA
							Power-Mumbai Electricity</option>
						<option value="Torrent Power Limited Electricity">Torrent
							Power Limited Electricity</option>
					</select>
				</div>
				<div class="amount">
					<label for="amount">Amount :</label> <input type="number"
						name="eleAmount" placeholder="Enter Amount to pay" required min="50" step="0.01">
				</div>
				<div class="payment">
					<input type="submit" value="Payment">
				</div>
			</form>
		</div>
		<img src="./images/eleBill.svg" alt="electricity bill SVG">
	</div>

</body>
</html>
