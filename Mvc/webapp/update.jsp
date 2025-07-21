<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .container {
        background-color: #ffffff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        width: 50%;
    }
    h2 {
        text-align: center;
        color: #4CAF50;
    }
    label {
        font-weight: bold;
        color: #333;
    }
    input[type="text"], input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }
    input[type="submit"] {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 10px;
        margin-top: 10px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <div class="container">
        <h2>Update Employee Details</h2>
        <form action="update">
            <input type="hidden" name="eid" value="${records.eid}">
            
            <label>Employee Name:</label>
            <input type="text" name="ename" value="${records.ename}">
            
            <label>Employee Address:</label>
            <input type="text" name="addrs" value="${records.addrs}">
            
            <label>Employee Salary:</label>
            <input type="text" name="salary" value="${records.salary}">
            
            <label>Employee Username:</label>
            <input type="text" name="user" value="${records.user}">
            
            <label>Employee Password:</label>
            <input type="text" name="password" value="${records.password}">
            
            <input type="submit" value="UPDATE">
        </form>
    </div>
</body>
</html>