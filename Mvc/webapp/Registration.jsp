<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>
    <style>
        body {
            background-color: #f4f4f4;
            font-family: Arial, sans-serif;
        }
        .container {
            width: 40%;
            margin: 50px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Employee Registration</h2>
        <form action="reg">
            <label>Employee Id:</label>
            <input type="text" name="eid">
            
            <label>Employee Name:</label>
            <input type="text" name="ename">
            
            <label>Employee Address:</label>
            <input type="text" name="addrs">
            
            <label>Employee Salary:</label>
            <input type="text" name="salary">
            
            <label>User Name:</label>
            <input type="text" name="user">
            
            <label>Password:</label>
            <input type="password" name="password">
            
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>