<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Case Study</title>


<style>
   body {
            padding: 0;
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
            background-color: rgb(48, 46, 46);
            color: white;
            padding-top: 25vh;
        }
        
        .container {
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
        
        form {
            display: flex;
            flex-direction: column;
            width: 90%;
        }
        
        input {
            height: 40px;
            border-radius: 10px;
            border: none;
            outline: none;
            margin: 5px;
            text-align: center;
            font-size: 18px;
            color: white;
            background-color: rgb(48, 46, 46);
        }
        
        .btns {
            margin: 15px auto;
        }
        
        button {
            background-color: rgb(0, 0, 0);
            color: white;
            border: none;
            padding: 8px 30px;
            border-radius: 10px;
            font-size: 18px;
            cursor: pointer;
            margin: auto;
            display:block;
            text-align:center;
            
        }
        
        button:hover {
            background-color: green;
            
        }
        
        p {
            color: red;
            text-align: center;
            display: none;
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


<script type="text/javascript">
    function Validate() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confirm_password").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
</script>
 

<body>
 <div class="container">
        <h2>Registration</h2>
        <form action="Register1" method="post">
            
            <input type="number" name="userid" id="userid" placeholder="User ID" required>
            <input type="text" name="uname" id="username" placeholder="User Name" required>
            <input type="email" name="email" id="email" placeholder="Email" required>
            <input type="mobile_number" name="phone" id="mobileno" placeholder="Mobile No" required>
            <input type="password" name="password" id="password" placeholder="Password" required>
            <input type="password" name="confirm_password" id="confirm_password" placeholder=" Confirm Password" required>

            <div class="btns">
                <button type="submit" value="Register1" id="lg" onclick="return Validate()">Register</button>
            </div>

        </form>
    </div>

</body>
</html>