<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn</title>
</head>
<body>
<h1>Welcome to login page ${name}</h1>
<pre>${errorMessage}</pre>
	<form method="post" >
		<table>
			<tr>
				<td>
					<span>Name:</span>
				</td>
				<td>
					<input type="text" name="name" class="tab1Class" placeholder="Enter UserName"/>
				</td>
			</tr>
			<tr>
			<td>
				<span>Password:</span>
			</td>
			<td>
				<input type="password" name="password" class="tab1Class" placeholder="Enter your Password"/>
			</td>
			</tr>
		</table>
		<input type="submit" value="Login" onclick={}/>
	</form>
</body>
</html>