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
<link rel="stylesheet" href="css/register.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Bakbak+One&display=swap"
	rel="stylesheet">
<title>Register</title>
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
 
<body class="body bgimage">
 <div class="first-div">
        <h2>Registration</h2>
        <form action="Register1" method="post">
            <input type="text" name="uname" id="username" placeholder="Name" required><br><hr>
            <input type="email" name="email" id="email" placeholder="eg:abc@gmail.com" required><br><hr>
            <input type="mobile_number" name="phone" id="mobileno" placeholder="Phone" required><br><hr>
            <input type="password" name="password" id="password" placeholder="eg:Ab@1234" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
				title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
				placeholder="eg:Abc@1234"><br><hr>
            <input type="password" name="confirm_password" id="confirm_password" placeholder="Confirm Password" required><br><hr>

            <div class="btns">
                <button type="submit" value="Register1" id="lg" onclick="return Validate()" class="b1">Register</button>
            </div>

        </form>
    </div>

</body>
</html>