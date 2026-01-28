<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
<h1>Admin Dashboard</h1>
<p>Welcome, ${pageContext.request.userPrincipal.name}</p>
<p>This page should only be accessible to ADMIN users.</p>
<p>
    <a href="${pageContext.request.contextPath}/welcome">Back to Welcome</a> |
    <a href="${pageContext.request.contextPath}/logout">Logout</a>
</p>
</body>
</html>