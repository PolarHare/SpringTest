<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Авторизация</title>
    </head>
    <body>
        <c:if test="${param.error}">
            <div>
                Неверная пара логина/пароля!
            </div>
        </c:if>
        <c:if test="${param.logout}">
            <div>
                Вы вышли из своего аккаунта.
            </div>
        </c:if>
        <form action="${pageContext.request.contextPath}/j_spring_security_check" method="post">
            <div><label> Логин: <input type="text" name="j_username"/> </label></div>
            <div><label> Пароль: <input type="password" name="j_password"/> </label></div>
            <div><input type="submit" value="Войти"/></div>
        </form>
    </body>
</html>