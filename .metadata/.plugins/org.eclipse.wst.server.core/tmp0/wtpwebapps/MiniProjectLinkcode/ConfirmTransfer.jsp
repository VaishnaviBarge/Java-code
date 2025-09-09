<%@page import="bank.model.Register"%>
<%@page import="bank.model.FundTransfer" %>
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
    .recharge-info {
        margin-bottom: 20px;
        
    }
    .recharge-info div {
        margin-bottom: 10px;
        font-size:1.1em;
    }
    .amount {
        font-size: 1.2em;
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
    .cons-no,.serv-pro{
    	padding-bottom:10px;
    	
    }
</style>
</head>
<body>
	<div class="container">
	<%
	
	FundTransfer b=(FundTransfer)session.getAttribute("transferDetails");
	%>
	
		<div class="recharge-info">
			<div>
			<p class="cons-no"><strong>Account Number:</strong><%=b.getAccNo() %></p>
			</div>
			<div>
			<p class="serv-pro"><strong>IFSC Code:</strong><%=b.getIfsc() %>
			</div>
			<div>
			<p class="amount"><strong>Amount to Transfer:</strong><%=b.getAmount() %></p>
			</div>
		</div>
		<a href="NEFTBillController" class="confirm-link">Confirm</a>
	</div>
</body>
</html>