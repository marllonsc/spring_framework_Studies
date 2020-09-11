<html>

<body>

<form action ="registerUser" method="post">

    Name: <input type="text" name="name" id="name" th:value="${user.name}"/></br></br>
    Email: <input type="text" name="email" id="email" th:value="${user.email}"/> </br></br> <span th:text="${message}"></span></br></br></br></br>
    <input type="submit" name="Register" />

</form>

</body>
</html>