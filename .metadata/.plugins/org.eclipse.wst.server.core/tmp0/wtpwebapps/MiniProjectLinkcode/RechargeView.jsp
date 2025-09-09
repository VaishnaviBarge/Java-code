<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Mobile Recharge</title>
<link rel="stylesheet" href="RechargeViewStyle.css">
<style>
/* Add your CSS styles here */
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

.logout-btn {
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
  border: 10px rgb(68, 85, 247);
  border-radius: 10px;
  box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.5);
  padding: 20px;
  background-color: white;
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

select {
  appearance: none;
  background-color: white;
  border: 1px solid #ccc;
  font-size: 16px;
  height: 40px;
  padding: 0 10px;
  cursor: pointer;
  transition: border-color 0.3s ease;
}

select:focus {
  border-color: #298AC2;
  outline: none;
}

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
<script>
function updateAmountAndBenefits() {
    const planSelect = document.getElementById('rechargePlan');
    const selectedOption = planSelect.options[planSelect.selectedIndex];
    const amount = selectedOption.getAttribute('data-amount');

    document.getElementById('amount').value = amount;
}
</script>
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
            <h1>Mobile Recharge</h1>
        </div>
        <form action="RechargeController">
            <div class="Acc-no">
                <label for="id">Mobile Number :</label>
                <input type="text" name="mobNo" placeholder="Enter Mobile Number" required maxlength="10" pattern="\d{10}" title="Mobile number must be 10 digits">
            </div>
            <div class="ele-b">
                <label for="serviceProvider">Service Provider :</label>
                <select name="serviceProvider" id="serviceProvider" required>
                    <option value="Reliance Jio">Reliance Jio</option>
                    <option value="Bharti Airtel">Bharti Airtel</option>
                    <option value="Vodafone Idea">Vodafone Idea</option>
                    <option value="BSNL">BSNL</option>
                    <option value="MTNL">MTNL</option>
                </select>
            </div>
            <div class="ele-b">
                <label for="rechargePlan">Recharge Plan :</label>
                <select name="rechargePlan" id="rechargePlan" onchange="updateAmountAndBenefits()" required>
                    <option value="" disabled selected>Select a plan</option>
                    <option value="199" data-amount="199" data-benefits="1.5GB/day, 28 days validity">199 - 1.5GB/day, 28 days validity</option>
                    <option value="249" data-amount="249" data-benefits="2GB/day, 28 days validity">249 - 2GB/day, 28 days validity</option>
                    <option value="219" data-amount="219" data-benefits="1.5GB/day, 28 days validity">219 - 1.5GB/day, 28 days validity</option>
                    <option value="187" data-amount="187" data-benefits="2GB/day, 28 days validity">187 - 2GB/day, 28 days validity</option>
                    <option value="178" data-amount="178" data-benefits="1GB/day, 28 days validity">178 - 1GB/day, 28 days validity</option>
                </select>
            </div>
            <div class="amount">
                <label for="amount">Amount :</label>
                <input type="number" id="amount" name="rechAmt" placeholder="Select a plan" required readonly>
            </div>
            
            <div class="payment">
                <input type="submit" value="Payment" required>
            </div>
        </form>
    </div>
    <img src="./images/Recharge.jpg" alt="recharge image">
</div>
</body>
</html>
