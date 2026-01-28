<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<HTML>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Goal</title>
</head>
<body>
<form:form action="/addGoal" modelAttribute="goal">
    <form:label path="id">ID:</form:label>
    <form:input path="id"/>
    <form:errors path="id"/>
    <br/>

    <form:label path="minutes">Minutes:</form:label>
    <form:input path="minutes"/>
    <form:errors path="minutes"/>
    <br/>

    <label>exerciseDesc</label>
    <input name="exerciseDesc">
    <br/>

    <input type="submit"/>
</form:form>
</body>
</HTML>