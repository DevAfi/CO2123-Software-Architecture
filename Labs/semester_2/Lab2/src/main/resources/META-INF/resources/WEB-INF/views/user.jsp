<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Page</title>
</head>
<body>
<h1>User Dashboard</h1>
<p>Welcome, ${pageContext.request.userPrincipal.name}</p>
<p>This page is for logged-in users (USER or ADMIN).</p>
<p>
    <a href="${pageContext.request.contextPath}/welcome">Back to Welcome</a> |
    <a href="${pageContext.request.contextPath}/logout">Logout</a>
</p>
</body>
</html>