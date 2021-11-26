<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 >List Employee</h1>
    <a href="/add" class="btn btn-success">Thêm mới</a>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Wage</th>
        </tr>
        </thead>
        <tbody>
       <c:forEach var="e" items="${employees}">
        <tr class="table-success">
            <th scope="row">${e.id}</th>
            <td>${e.name}</td>
            <td>${e.wage}</td>
        </tr>
       </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
