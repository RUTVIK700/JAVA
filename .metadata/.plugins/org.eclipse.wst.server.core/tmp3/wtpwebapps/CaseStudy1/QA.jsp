<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Case Study</title>
<style>

  body,html
{
 background-image: url("img/q4.jpg");
 background-size: 1100px;
  height: 600px;
  width: 100%;
  margin: 0;
  display: inline-block;
}
</style>

</head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script>
function loadpage()
{
	$('#page').load('ShowQuestion.jsp');
	}

</script>

<script>
function loadpage2()
{
	$('#page').load('MyQuestion.jsp');
	//$('#page').load('ShowQuestion.jsp');
	}

</script>

<body>

<form action="QuestionServlet" method="post">

<p><b>Welcome</b><br>Problem shared is problem solved..</p>

<textarea cols="80%" name="question" rows="5" placeholder="Ask your question here."></textarea><br>
         <br></br>
         <textarea cols="100%" rows="5" name="detailquestion" placeholder="Provide question details here."></textarea><br>

<button type="submit" style="margin-left:79%;margin-top:4%;width:70px;background-color:lightblue">ASK</button><br>

<a href="#" onclick="loadpage()">All Questions || </a>
<a href="#" onclick="loadpage2()" >My Questions</a>
<div id="page">


</div>


</form>
</body>
</html>

