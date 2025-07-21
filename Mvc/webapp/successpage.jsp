<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.tech.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript">
        function addEmp() {
            alert("Do you want to add a new Employee?");
            document.myform.action = "Registration.jsp";
            document.myform.submit();
        }
        function deleteEmp() {
            alert("Do you want to delete the record?");
            document.myform.action = "delete";
            document.myform.submit();
        }
        function updateEmp() {
            alert("Do you want to update Employee details?");
            document.myform.action = "edit";
            document.myform.submit();
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
            background-color: #008CBA;
            color: white;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
        }
        input[type="button"]:hover {
            background-color: #005f73;
        }
    </style>
</head>
<body>
    <h2>Employee Records</h2>
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
        <input type="button" value="Add New Employee" onclick="addEmp()">
        <input type="button" value="Delete Employee" onclick="deleteEmp()">
        <input type="button" value="Update Employee" onclick="updateEmp()">
    </form>
</body>
</html>