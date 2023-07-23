<%--
  Created by IntelliJ IDEA.
  User: jamie
  Date: 2023-07-23
  Time: 오후 4:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Page</h1>

<ul>
    <c:forEach var="dto" items="${list}">
        <li>${dto}</li>
    </c:forEach>
</ul>

<ul>
    <c:forEach var="num" begin="1" end="10">
        <li>${num}</li>
    </c:forEach>
</ul>

</body>
</html>
