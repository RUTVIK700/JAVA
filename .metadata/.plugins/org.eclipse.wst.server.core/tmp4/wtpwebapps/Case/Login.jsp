<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Case Study</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/login.css">
</head>
<body>

<div class="bgimage">
<div class="first-div">
		<h1>LOGIN</h1>
        <form action="LoginServlet" method="post">
            <input type="text" name="username" id="username" placeholder="User Name" required><br><hr>
            <input type="password" name="pass" id="pass" placeholder="Password" required><br><hr>
           <div class="btns">
           <a href="QA.jsp"> <button type="submit" id="f1" class="b1">Login</button></a>
            <a href="Register.jsp"><button type="button" class="b1">Register</button></a>
           </div>
         </form>
	</div>
	</div>
	<script src="js/login.js" charset="utf-8"></script>

</body>


</html>