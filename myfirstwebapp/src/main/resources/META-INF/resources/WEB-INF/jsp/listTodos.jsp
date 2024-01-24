<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>List - Todo Page</title>
</head>
<body>
	<div>
		<h1>Welcome to our APP!!</h1>
	</div>
	<div>
		<h1>Name: ${name}</h1>
	</div>

	<h1>Your Todos are:</h1>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
