
<html>
<body>
<table>
<tr>
<th> ID </th>
<th> Name </th>
<th> Salary </th>
<tr>
<tr th:each="obj: ${list}">
            <td th:text="${obj.id}">1</td>
            <td><a href="#" th:text="${obj.name}">Title ...</a></td>
            <td th:text="${obj.salary}">Text ...</td>
 </tr>
</table>
 <h2>List :  <p th:text="${list}"></p>  </h2></br >
</body>
</html>
