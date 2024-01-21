<html>
<head>
<title>JSP Page</title>

<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

form {
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
}

label {
	display: block;
	margin-bottom: 8px;
}

input {
	width: 100%;
	padding: 8px;
	margin-bottom: 16px;
	box-sizing: border-box;
}
</style>
</head>
<body>
	<form method="post">
		<label for="username">Username:</label> 
		<input type="text" id="name" name="name"> 
		<label for="password">Password:</label>
		<input type="password" id="password" name="password"> 
		<input type="submit">
	</form>
</body>
</html>