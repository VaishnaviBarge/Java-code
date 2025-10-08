<%@page import="bank.model.Fastag" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
    .recharge-info {
        margin-bottom: 20px;
        
    }
    .recharge-info div {
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
    
       .cancel-link {
        display: inline-block;
        padding: 10px 20px;
        background-color: red;
        color: #fff;
        text-decoration: none;
        border-radius: 5px;
    }
    .confirm-link:hover {
        background-color: #0056b3;
    }
    .cons-no,.serv-pro{
    	padding-bottom:10px;
    	
    }
</style>
</head>
<body>
	<div class="container">
		<%
			Fastag ft = (Fastag)session.getAttribute("ftDetails");
		%>
		<div class="recharge-info">
			<div>
			<p class="cons-no"><strong>Vehicle Number : </strong><%= ft.getVehNo()%></p>
			</div>
			<div>
			<p class="serv-pro"><strong>Car Model : </strong><%= ft.getCarModel() %></p>
			</div>
			<div>
			<p class="amount"><strong>Total Amount : </strong><%= ft.getFasTagAmt() %></p>
			</div>
		</div>
			<a href="FastagBillController" class="confirm-link">Confirm</a>
			<a href="FastTagView.jsp" class="cancel-link">Cancel</a>
	</div>
	
	
</body>
</html>