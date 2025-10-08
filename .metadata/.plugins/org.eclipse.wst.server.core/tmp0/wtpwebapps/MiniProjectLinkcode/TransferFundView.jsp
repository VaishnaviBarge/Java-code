<%@page import="bank.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@charset "UTF-8";
@import url("https://fonts.googleapis.com/css2?family=Open+Sans&family=Raleway:wght@400;700&display=swap");

* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  font-family: "Open Sans", sans-serif;
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

.card-container {
  display: flex;
  gap: 20px;
  justify-content: center;
  text-align: center;
  margin: 150px 0;
}

.card {
  background-color: #ffffff;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  text-align: center;
  padding: 30px;
  width: 300px;
  height: 400px; /* Fixed height */
  color: #298AC2;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  align-items: center;
}

.card .icon {

  font-size: 30px;
  width:70%;
  text-align: center;
  /* margin-bottom: 10px; */
}

.card h2 {
  font-size: 24px;
  margin: 10px 0;
}

.card p {
  font-size: 16px;
  margin: 10px 0;
  color: #666;
}

.card a {
  background-color: #749B29;
  color: white;
  padding: 10px 20px;
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px;
  display: inline-block;
}

.card a:hover {
  background-color: #392a8c;
}
</style>
</head>
<body>
<body>
<%
	Register r = (Register)session.getAttribute("loginInfo");
	%>
    <div class="card-container">
        <div class="card">
            <h2>NEFT</h2>
            <img class="icon" src="./images/nefticon.svg" alt="add image" >
            <p>National Electronic Fund Transfer</p>
            <a href="NEFTfund.jsp" class="button">NEFT</a>
        </div>
        <div class="card">
            <h2>RTGS</h2>
            <img class="icon" src="./images/rtgsicon.svg" alt="add image" >
            <p>Real Time Gross Settlement</p>
            <a href="RTGS.jsp" class="button">RTGS</a>
        </div>
        <div class="card">
            <h2>IMPS</h2>
            <img class="icon" src="./images/impsicon.svg" alt="add image" >
            <p>Imidiate Payment Service</p>
            <a href="IMPS.jsp" class="button">IMPS</a>
        </div>
   </div>
</body>
</html>