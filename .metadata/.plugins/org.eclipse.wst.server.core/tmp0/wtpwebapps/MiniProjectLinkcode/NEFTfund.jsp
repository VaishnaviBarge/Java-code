<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body {
    background-color: rgb(68, 85, 247);
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}
.container {
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
		<div class="form-container">
			<div class="header">
				<h1>National Electronic Fund Transfer</h1>
			</div>
		
		<form action="NEFTController">
			<div class="Acc-no">
				<label for="id">Account Number:</label>
				<input type="text" name="accNo" placeholder="Enter Account Number" required>
			</div>
			<div class="ele-b">
				<label for="id">IFSC code :</label>
				<input type="text" name="ifsc" placeholder="Enter bank ifsc code" required>
			</div>
			<div class="amount">
				<label for="amount">Amount :</label>
				<input type="number" name="amount" placeholder="Enter amount to transfer" min="1" required>
			</div>
			<div class="payment">
                <input type="submit" value="Transfer" required>
            </div>
		</form>
	</div>
	<img src="./images/neft.png" alt="NEFT Transfer">
</div>
</body>
</html>