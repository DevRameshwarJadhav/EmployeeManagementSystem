<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.tech.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript">
        function updateEmp() {
            alert("Do you want to update Employee details?");
            document.myform.action = "edit";
            document.myform.submit();
        }
        function login() {
            window.location.href = "index.jsp";
        }
    </script>
    <meta charset="ISO-8859-1">
    <title>Employee Records</title>
    <style>
        body {
            background: #f0f8ff;
            font-family: Arial, sans-serif;
            text-align: center;
        }
        table {
            margin: auto;
            width: 80%;
            border-collapse: collapse;
            background: #ffffff;
            box-shadow: 0px 0px 10px gray;
        }
        th, td {
            padding: 10px;
            border: 2px solid #4CAF50;
            text-align: center;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        input[type="button"] {
            margin: 10px;
            padding: 10px 20px;
            border: none;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
            color: white;
        }
        #updateBtn {
            background-color: #008CBA;
        }
        #updateBtn:hover {
            background-color: #005f73;
        }
        #loginBtn {
            background-color: #008CBA;
        }
        #loginBtn:hover {
            background-color: #2e7d32;
        }
    </style>
</head>
<body>
    <h2>User Records</h2>
    <form name="myform">
        <table>
            <tr>
                <th>Select</th>
                <th>Eid</th>
                <th>Ename</th>
                <th>Address</th>
                <th>Salary</th>
                <th>Username</th>
                <th>Password</th>
            </tr>
            <c:forEach items="${records}" var="emp">
                <tr>
                    <td><input type="radio" name="rd" value="${emp.eid}"></td>
                    <td><c:out value="${emp.eid}"/></td>
                    <td><c:out value="${emp.ename}"/></td>
                    <td><c:out value="${emp.addrs}"/></td>
                    <td><c:out value="${emp.salary}"/></td>
                    <td><c:out value="${emp.user}"/></td>
                    <td><c:out value="${emp.password}"/></td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <input type="button" id="updateBtn" value="Update User" onclick="updateEmp()">
        <input type="button" id="loginBtn" value="Go To Login" onclick="login()">
    </form>
</body>
</html>