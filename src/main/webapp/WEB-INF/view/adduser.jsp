<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<style>
    #centerForm {
        position: absolute; /* Абсолютное позиционирование */
        width: 350px; /* Ширина слоя в пикселах */
        height: 170px; /* Высота слоя в пикселах */
        left: 50%; /* Положение слоя от левого края */
        top: 30%; /* Положение слоя от верхнего края */
        margin-left: -150px; /* Отступ слева */
        margin-top: -100px;	/* Отступ сверху */
        background: #C4E4ED; /* Цвет фона */
        border: solid 1px black; /* Параметры рамки вокруг */
        padding: 10px; /* Поля вокруг текста */
        overflow: auto; /* Добавление полосы прокрутки */
    }
</style>


<div id="centerForm">


    <form:form method="post" commandName="user" action="/add" >

    <p>    <form:label path="name"> Name </form:label>
        <form:input path="name" />
    </p>
    <p>
        <form:label path="login"> Login </form:label>
        <form:input path="login" />
    </p>
    <form:label path="password"> Password </form:label>
        <form:input path="password" />
    </p>

    <footer>
        <input type="submit" value="   Enter   " tabindex="4">
    </footer>
    </p>
    </form:form>
</div>

</body>
</html>
