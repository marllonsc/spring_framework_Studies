<html>
<body>

<form action ="updateUser" method="post">

     ID: <input type="text" name="id" th:value="${user.id}"/></br></br>
    Name: <input type="text" name="name" id="name" th:value="${user.name}"/></br></br>
    Email: <input type="text" name="email" id="email" th:value="${user.email}"/> </br> <span th:text="${message}"></span></br></br></br></br>
    <input type="submit" name="Update" />

</form>

</body>
</html>