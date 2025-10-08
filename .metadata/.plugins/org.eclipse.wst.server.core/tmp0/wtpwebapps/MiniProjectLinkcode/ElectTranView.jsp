<%@page import="bank.model.Electricity"%>
<%@page import="bank.model.RechargeBill"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Details</title>
<style>
    body {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        background-color: #b0d6ff; /* Blue shaded background */
        font-family: Arial, sans-serif;
    }
    .container {
        background-color: white;
        border-radius: 10px;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        max-width: 600px;
        width: 100%;
        padding: 20px;
        text-align: center;
    }
    h2 {
        margin-bottom: 20px;
        color: #333;
    }
    .success-icon {
        font-size: 50px;
        color: green;
        margin-bottom: 20px;
    }
    .title {
        font-size: 24px;
        margin-bottom: 10px;
    }
    .subtitle {
        color: #555;
        margin-bottom: 20px;
    }
    .details {
        text-align: left;
        margin-bottom: 20px;
    }
    .details p {
        margin: 5px 0;
        color: #333;
    }
    .details .Total-amt-info,
    .details .Txn-id-info,
    .details .Consumer-Number,
    .details .elec-board-info,
    .details .bill-date-info {
        font-weight: bold;
        color: #007BFF;
    }
    .go-to-dashboard {
        background-color: #007BFF;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        text-decoration: none;
        display: inline-block;
        margin-top: 10px;
    }
    .go-to-dashboard:hover {
        background-color: #0056b3;
    }
    .success-icon img {
        max-width: 10%;
        height: auto;
    }
</style>
</head>
<body>
    <div class="container">
        <%
            RechargeBill b = (RechargeBill)session.getAttribute("ElectBill");
        %>
        <h2>Transaction Details</h2>
        <div class="success-icon"><img src="./images/Tick.jpg"></div>
        <div class="title">Payment Success!</div>
        <div class="subtitle">Your payment has been successfully done.</div>
        
        <div class="details">
            <div class="Total-amt">
                <p><strong>Total Payment</strong></p>
                <p class="Total-amt-info"><%=b.getTxnAmt() %></p>
            </div>
            <div class="Txn-id">
                <p><strong>Transaction Id</strong></p>
                <p class="Txn-id-info"><%=b.getTxnId() %></p>
            </div>
            <div class="Acc-no">
                <p><strong>Consumer Number</strong></p>
                <p class="Consumer-Number"><%=b.getTxnMobNo() %></p>
            </div>
            <div class="elec-board">
                <p><strong>Electricity Board</strong></p>
                <p class="elec-board-info"><%=b.getTxnServiceProvider() %></p>
            </div>
            <div class="bill-date">
                <p><strong>Date</strong></p>
                <p class="bill-date-info"><%=b.getTxnDate() %></p>
            </div>
        </div>
        <a href="DashboardView.jsp" class="go-to-dashboard">Go to Dashboard</a>
    </div>
</body>
</html>
