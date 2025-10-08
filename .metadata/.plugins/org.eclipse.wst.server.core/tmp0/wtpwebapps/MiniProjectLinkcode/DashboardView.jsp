
<%@page import="bank.model.Register"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" type="text/css" href="./css/DashBoardStyle.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" />
<style>
</style>
</head>
<body>
	<%
	Register r = (Register)session.getAttribute("loginInfo");

	%>


	<header class="container">
		<nav>
			<a href="DashboardView.jsp"><img src="./images/logo.png"
				alt="logo" /></a>
			<ul>
				<li><a href="DashboardView.jsp">Dashboard</a></li>
				<li><a href="ProfileView.jsp">Profile</a></li>
				<li><a class="logout-btn" href="login.jsp">Log Out</a></li>
			</ul>
		</nav>
		<div class="hero">
			<section class="hero-left">
				<h2 class="welcome-text"
					style="color: #298AC2; margin-bottom: 10px;">
					Welcome <strong style="color: #749B29;"><%= r.getfName() %>
						<%=r.getlName() %></strong>
				</h2>
				<h1>Effortless Banking: Pay Bills, Recharge, and Transfer Funds
					Seamlessly.</h1>
				<p>Experience the ultimate convenience in managing your finances
					with our all-in-one banking app.</p>

				<a href="ProfileView.jsp">View Profile</a>
			</section>

			<section class="right">
				<img src="images/undraw_mobile_pay_re_sjb8.svg"
					alt="Hero illustration" />
			</section>
		</div>
	</header>

	<div class="card-container">
		<div class="account-card">
			<h2>Account Details</h2>
			<%
			 	Float updatedBal = (Float)session.getAttribute("updatedBal");
			if (updatedBal == null) {
	            updatedBal = r.getAccBal(); // 
	        }
			%>

			<%
					String sucessMessage = (String) request.getAttribute("sucessMsgFund");
					if (sucessMessage != null) {
					%>
			<p style="color: green; text-align: center;"><%=sucessMessage%></p>
			<%
					}
					%>
			<p>
				<strong>Account Number:</strong>
				<%= r.getAccNo()%>
			</p>
			<p>
				<strong>Username :</strong>
				<%= r.getUname()%>
			</p>
			<p>

				<strong style="padding-right:10px;">Balance :- </strong>
				<%= updatedBal %><a class="update-Bal-Btn" href="UpdateBalanceController"><i class="fa-solid fa-arrows-rotate"></i></a>
			</p>

			<a class="add-btn" href="AddFundView.jsp">Add Funds</a>


		</div>
		<div class="card">
			<div class="icon">
				<i class="fas fa-money-check-alt"></i>
			</div>
			<h2>Pay Bills</h2>
			<p>Convenient bill payments</p>
			<a class="card-btn" href="PayBillView.jsp">Pay Bills</a>
		</div>
		<div class="card">
			<div class="icon">
				<i class="fas fa-exchange-alt"></i>
			</div>
			<h2>Fund Transfer</h2>
			<p>Quick and easy transfers</p>
			<a href="TransferFundView.jsp">Fund Transfer</a>
		</div>
		<div class="card">
			<div class="icon">
				<i class="fas fa-file-alt"></i>
			</div>
			<h2>View Statement</h2>
			<p>Access your transaction history</p>
			<a href="StatementController">View Statement</a>
		</div>
	</div>


</body>
</html>


