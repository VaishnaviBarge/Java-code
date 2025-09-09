<%@page import="bank.model.Electricity" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #b0d6ff;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .container {
        background-color: #fff;
        padding: 100px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
        text-align: center;
    }
    .electricity-info {
        margin-bottom: 20px;
        
    }
    .electricity-info div {
        margin-bottom: 10px;
        font-size:1.1em;
    }
    .amount {
        font-size: 1.5em;
        font-weight: bold;
        color: #749B29;
    }
    .confirm-link {
        display: inline-block;
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        text-decoration: none;
        border-radius: 5px;
    }
    .confirm-link:hover {
        background-color: #0056b3;
    }
    
     .cancel-link {
        display: inline-block;
        padding: 10px 20px;
        background-color: red;
        color: #fff;
        text-decoration: none;
        border-radius: 5px;
    }
    
    .cons-no,.serv-pro{
    	padding-bottom:10px;
    	
    }
</style>
</head>
<body>
	<div class="container">
	<% 
		Electricity elect=(Electricity)session.getAttribute("electDetails");
	%>
<div class="electricity-info">
	<div><p><strong>Account Number:</strong><%=elect.getAccNo() %></p></div>
	<div><p><strong>Electricity Board:</strong><%=elect.getEleBoard() %></p></div>
	<div class="amount">Amount:<%=elect.getEleAmount() %></div>
</div>
<a href="ElectricityBillController" class="confirm-link">Confirm</a>
<a href="ElectricityView.jsp" class="cancel-link">Cancel</a>
</div>
</body>
</html>