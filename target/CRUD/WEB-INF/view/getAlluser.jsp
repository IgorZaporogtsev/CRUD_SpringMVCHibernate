<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">

    <title>CRUD_SpringMVCHibernate</title>

</head>

<body>


<style>
    #centerTable{
        position: absolute; /* Абсолютное позиционирование */
        width: 400px; /* Ширина слоя в пикселах */
        height: 170px; /* Высота слоя в пикселах */
        left: 50%; /* Положение слоя от левого края */
        top: 60%; /* Положение слоя от верхнего края */
        margin-left: -150px; /* Отступ слева */
        margin-top: -100px;	/* Отступ сверху */
        background: #DBE199; /* Цвет фона */
        border: solid 1px black; /* Параметры рамки вокруг */
        padding: 10px; /* Поля вокруг текста */
        overflow: auto; /* Добавление полосы прокрутки */
    }
</style>


</div>

<div id="centerTable">

    <table border="1">


        <tr>
            <th>id</th>
            <th>name</th>
            <th>login</th>
            <th>password</th>
            <th>role</th>
        </tr>


        <c:forEach var="users" items="${getAllUser}">
            <tr>
                <td><c:out value="${users.id}"/></td>
                <td><c:out value="${users.name}"/></td>
                <td><c:out value="${users.login}"/></td>
                <td><c:out value="${users.password}"/></td>
                <td><c:out value="${users.role}"/></td>

                <td><a href="<c:url value='/user/update/${users.id}'/>">Update</a></td>

                <%--<td><a href="/delete/${users.id}">Delete </a></td>--%>

                <td><a href="<c:url value='/user/delete/${users.id}'/>">Delete</a></td>

                <%--<td><a href="${pageContext.request.contextPath}/delete?id=${users.id}">Delete </a></td>--%>


            </tr>
        </c:forEach>


    </table>
<br>
    <a href="/user/add">Add User</a>
</div>




</div>
</body>
</html>
