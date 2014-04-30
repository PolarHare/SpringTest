<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Spring Security Example </title>
    </head>
    <body>
        <c:if test="${param.error}">
            <div>
                Invalid username and password.
            </div>
        </c:if>
        <c:if test="${param.logout}">
            <div>
                You have been logged out.
            </div>
        </c:if>
        <form action="${pageContext.request.contextPath}/login" method="post">
            <div><label> User Name : <input type="text" name="username"/> </label></div>
            <div><label> Password: <input type="password" name="password"/> </label></div>
            <div><input type="submit" value="Sign In"/></div>
        </form>
    </body>
</html>