<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Login</title>
    <style>
        body {
            background-color: #2c3e50;
            color: white;
            font-family: Arial, sans-serif;
            text-align: center;
        }
        .container {
            width: 40%;
            margin: auto;
            background-color: #27ae60;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
        }
        marquee {
            background-color: #1abc9c;
            color: white;
            font-size: 20px;
            padding: 10px;
            border-radius: 5px;
        }
        input[type="text"], input[type="password"] {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
            border: none;
        }
        input[type="submit"] {
            background-color: #3498db;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #2980b9;
        }
        a {
            color: yellow;
            font-size: 18px;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>
        <marquee direction="right">Welcome To Spring MVC</marquee>
    </h2>
    <div class="container">
        <h2>Employee Login</h2>
        <form action="log">
            <label for="user">Login Id:</label>
            <input type="text" name="user" id="user" required>
            <br>
            <label for="password">User Password:</label>
            <input type="password" name="password" id="password" required>
            <br>
            <input type="submit" value="LOGIN">
        </form>
        <h3>
            <a href="Registration.jsp">FOR NEW REGISTRATION CLICK HERE</a>
        </h3>
    </div>
</body>
</html>