<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <a href="studentreg.jsp">Student Registration</a>
    <a href="viewall">View All Students</a>
    <title>View All Students</title>
</head>
<body>
    <h3 style="text-align: center;"><u>View All Students</u></h3>
<%--     <p style="text-align: center;">Total Students: <c:out value="${studentCount}"></c:out></p>
 --%>    <table>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>GENDER</th>
            <th>AGE</th>
            <th>DEPARTMENT</th>
            <th>EMAIL</th>
            <th>CONTACT</th>
        </tr>
        <c:forEach items="${studentlist}" var="student">
            <tr>
                <td><c:out value="${student.id}"/></td>
                <td><c:out value="${student.name}"/></td>
                <td><c:out value="${student.gender}"/></td>
                <td><c:out value="${student.age}"/></td>
                <td><c:out value="${student.department}"/></td>
                <td><c:out value="${student.email}"/></td>
                <td><c:out value="${student.contact}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
