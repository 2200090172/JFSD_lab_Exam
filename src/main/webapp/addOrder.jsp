<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Order</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            margin: 50px auto;
            width: 50%;
            padding: 20px;
            background-color: white;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            margin-bottom: 20px;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 5px;
            font-weight: bold;
        }
        input {
            margin-bottom: 15px;
            padding: 8px;
            font-size: 16px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        button {
            padding: 10px;
            font-size: 16px;
            color: white;
            background-color: #007BFF;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
        .error {
            color: red;
            margin-top: -10px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Add New Order</h1>
        <form action="/addorder" method="POST">
            <label for="orderId">Order ID:</label>
            <input type="text" id="orderId" name="orderId" placeholder="Enter Order ID" required>

            <label for="productName">Product Name:</label>
            <input type="text" id="productName" name="productName" placeholder="Enter Product Name" required>

            <label for="customerName">Customer Name:</label>
            <input type="text" id="customerName" name="customerName" placeholder="Enter Customer Name" required>

            <label for="quantity">Quantity:</label>
            <input type="number" id="quantity" name="quantity" placeholder="Enter Quantity" required>

            <label for="orderDate">Order Date:</label>
            <input type="date" id="orderDate" name="orderDate" required>

            <button type="submit">Submit Order</button>
        </form>
    </div>
</body>
</html>
