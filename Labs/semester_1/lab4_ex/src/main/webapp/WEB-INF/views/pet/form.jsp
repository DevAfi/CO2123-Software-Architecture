<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
    <head>
        <title>Pet</title>
    </head>
    <body>
    <form:form action="/showPet" modelAttribute="pet">
        <form:label path="name">Enter name:</form:label>
        <form:input path="name"/>
        <form:errors path="name"/>

        <form:label path="species">Enter species:</form:label>
        <form:select path="species" items="${allSpecies}"/>
        <form:errors path="species"/>

        <form:label path="food">Enter food:</form:label>
        <form:input path="food"/>
        <form:errors path="food"/>
        <input type="submit"/>
    </form:form>
    </body>
</HTML>