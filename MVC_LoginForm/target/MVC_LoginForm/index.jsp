<html>
<head>
	<title>MVC login example</title>
</head>
<body>
<h2 style="color:'red'">${message}</h2>
<form action="login" method="post">
		<label for="uname">Name: </label>
		<input type="text" name="userName"/>
		<br/>
		<label for=password>Password: </label>
		<input type="password" name="password"/>
		<br/>
		<input type="submit" value="login"/>
	</form>
</body>
</html>
