<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/Q&A.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Bakbak+One&display=swap"
	rel="stylesheet">
<title>Q&A</title>


</head>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"
	type="text/javascript"></script>
<script>
	function loadpage() {
		$('#page').load('ShowQuestion.jsp');
	}
</script>

<script>
	function loadpage2() {
		$('#page').load('MyQuestion.jsp');
		//$('#page').load('ShowQuestion.jsp');
	}
</script>

<body class="b">
      <div class="body">
        <div class="b1">
          <img class="img1" src="css/talk.png" alt="">
          <h1 class="h1">Welcome</h1>
          <p class="h1">Problem shared is a problem solved!</p> <br>
        </div>
	<form action="QuestionServlet" method="post">
		<textarea cols="80%" name="question" rows="5"
			placeholder="Ask your question here."></textarea>
		<br> <br></br>
		<textarea cols="100%" rows="5" name="detailquestion"
			placeholder="Provide question details here."></textarea>
		<br>
		<button type="submit"class="bt1">ASK!</button>
		<br> <a href="#" onclick="loadpage()">All Questions || </a> <a
			href="#" onclick="loadpage2()">My Questions</a>
		<div id="page"></div>
	</form>
</body>
</html>

