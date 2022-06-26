<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Case Study</title>

<style>
        body{
            padding: 0;
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
            background-color: rgb(48, 46, 46);
            color: white;
            padding-top: 25vh;
        }
        .container{
            width: 400px;
            display: flex;
            flex-direction: column;
            margin: auto;
            align-items: center;
            background-color: rgb(22, 21, 21);
            border-radius: 15px;
            padding: 25px 10px;
            box-shadow: 0 0 15px rgb(80, 79, 79);
        }
        form{
            display: flex;
            flex-direction: column;
            width: 90%;
            
        }
        input{
            height: 40px;
            border-radius: 10px;
            border: none;
            outline: none;
            margin: 5px ;
            text-align: center;
            font-size: 18px;
            color: white;
            background-color: rgb(48, 46, 46);

        }
        .btns{
            margin: 15px auto;
        }
        button{
            background-color: rgb(0, 0, 0);
            color: white;
            border: none;
            padding: 8px 30px;
            border-radius: 10px;
            font-size: 18px;
            cursor: pointer;
            margin: 5px 25px;
        }
        button:hover{
            background-color: green;
        }

body,html
{
 background-image: url("img/img5.jpg");
 background-size: 1100px;
  height: 600px;
  width: 100%;
  margin: 0;
  display: inline-block;
}
</style>
</head>
<body>

<div class="container">
        <h2>Login</h2>
        <form action="LoginServlet" method="post">
       
            <input type="text" name="username" id="username" placeholder="User Name" required>
            <input type="password" name="pass" id="pass" placeholder="Password" required>
           <div class="btns">
           <a href="QA.jsp"> <button type="submit" id="f1">Login</button></a>
            <a href="Reg.jsp"><button type="button">Sign Up</button></a>
           </div>
         </form>
    </div>

</body>


</html>