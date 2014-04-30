<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Hello World page</title>
    </head>
    <body>
        <%--@elvariable id="user" type="com.polarnick.test.entities.User"--%>
        <div class="container">
            <h1>Эта страница защищена!</h1>
            <p>
                Привет, <b><c:out value="${user.name}"/></b>!
                Ваш возраст - <b><c:out value="${user.age}"/></b> лет! И это отличный возраст!
            </p>
        </div>
    </body>
</html>