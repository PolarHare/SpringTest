<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Hello World page</title>
    </head>
    <body>
        <div class="container">
            <h1>This is secured!</h1>
            <p>
                Hello <b><c:out value="${pageContext.request.remoteUser}"/></b>
            </p>
        </div>
    </body>
</html>