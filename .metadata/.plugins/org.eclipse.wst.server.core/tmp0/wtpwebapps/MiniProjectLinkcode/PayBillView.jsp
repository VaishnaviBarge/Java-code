<%@page import="bank.model.Register"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="css/PayBillStyle.css">
  

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" />
  <title>Recharge Services</title>
  
</head>

<body>
  <header class="container">
    <nav>
      <a href="#"><img src="./images/logo.png" alt="logo" /></a>
      <ul>
        <li><a href="DashboardView.jsp">Dashboard</a></li>
        <li><a href="ProfileView.jsp">Profile</a></li>
        <li><a class="logout-btn" href="login.jsp">Log Out</a></li>
      </ul>
    </nav>
  </header>

  <div class="card-container">
    <div class="card">
      <div class="icon">
        <i class="fas fa-mobile-alt"></i>
      </div>
      <h2>Mobile Recharge</h2>
      <p>Instant mobile top-ups</p>
      <a href="RechargeView.jsp">Make Recharge</a>
    </div>
    <div class="card">
      <div class="icon">
        <i class="fas fa-tv"></i>
      </div>
      <h2>DTH Recharge</h2>
      <p>Seamless DTH recharges</p>
      <a href="DTHView.jsp">DTH Recharge</a>
    </div>
    <div class="card">
      <div class="icon">
        <i class="fas fa-bolt"></i>
      </div>
      <h2>Electricity Bill</h2>
      <p>Pay your electricity bills</p>
      <a href="ElectricityView.jsp">Pay Bill</a>
    </div>
    <div class="card">
      <div class="icon">
        <i class="fas fa-car"></i>
      </div>
      <h2>Fastag Recharge</h2>
      <p>Quick Fastag recharges</p>
      <a href="FastTagView.jsp">FastTag</a>
    </div>
  </div>
</body>

</html>
    