<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <c:forEach var="g" items="${goals}">
            <c:forEach var="e" items="${g.exercises}">
                <p>${e.activity} for ${e.minutes} minute(s)</p>
            </c:forEach>
        </c:forEach>
    </body>
</html>