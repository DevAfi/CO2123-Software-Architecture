<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC>
<HTML>
<head>
    <title>Exercise</title>
</head>
<body>
<form:form action="/addExercise" modelAttribute="exercise">
    <form:label path="id">Exercise ID:</form:label>
    <form:input path="id" type="number"/>
    <form:errors path="id"/>
    <br/>


    <form:label path="minutes">Minutes:</form:label>
    <form:input path="minutes" />
    <form:errors path="minutes"/>
    <br/>


    <form:label path="activity">Enter Activity:</form:label>
    <form:input path="activity"/>
    <br/>


    <label>goalID</label>
    <input name="goalId" type="number">
    <br/>


    <input type="submit"/>
</form:form>
</body>
</HTML>