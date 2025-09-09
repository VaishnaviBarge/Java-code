<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Funds</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .container {
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
    }

    h2 {
        text-align: center;
        color: #298AC2;
        margin-bottom: 20px;
    }

    form {
        display: flex;
        flex-direction: column;
    }

    input[type="number"] {
        padding: 10px;
        font-size: 14px;
        border: 1px solid #ccc;
        border-radius: 3px;
        margin-bottom: 10px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        padding: 12px;
        font-size: 16px;
        background-color: #298AC2;
        color: #fff;
        border: none;
        border-radius: 3px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    input[type="submit"]:hover {
        background-color: #1e70b8;
    }
</style>
</head>
<body>
    <div class="container">
        <h2>Add Funds</h2>
        <form action="AddFundController" method="post">
            <input type="number" name="amt" placeholder="Enter Amount to Self Transfer" required min="500" step="0.01"/>
            <input type="submit" value="Confirm">
        </form>
    </div>
</body>
</html>
