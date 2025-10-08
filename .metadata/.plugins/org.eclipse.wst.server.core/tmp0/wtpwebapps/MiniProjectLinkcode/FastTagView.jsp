<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@import url("https://fonts.googleapis.com/css2?family=Open+Sans&family=Raleway:wght@400;700&display=swap");
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
            <h1>FasTag Recharge</h1>
            <%
					String errorMessage = (String) request.getAttribute("errorMessage");
					if (errorMessage != null) {
					%>
			<p style="color: red; font-size: 25px; text-align: center;"><%=errorMessage%></p>
			<%
					}
					%>
        </div>
		<form action="FastagController">
			<div class="Vehicle-no">
				<label for="vehicle-no">Vehicle Number:</label>
				<input type="text" name="vehNo" placeholder="Enter the Vehicle Number">
			</div>
		 	<div class="car-model">
				<label for="car-model">Car Model:</label>
				<input type="text" name="carModel" placeholder="Enter the car Model">
			</div>
			<div class="amount">
				<label for="amount"> Amount:</label>
				<input type="number" name="FasTagAmt" placeholder="Enter the Amount to pay" min="50" step="0.01">
			</div>
		<div class="payment">
			<input type="submit" value="Confirm">
		</div>
		</form>
		</div>
		<img src="./images/fastag.svg" alt="car img">
	</div>
		
</body>
</html>