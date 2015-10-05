<%-- 
    Document   : register
    Created on : Apr 15, 2015, 7:49:23 PM
    Author     : Ling
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        
        
      <script language="JavaScript">
    function validate(form)
    {
        if (form.firstName.value == "")
        {
            alert("Please fill in your first name");
            form.firstName.focus();
        }
        else if (form.lastName.value == "")
        {
            alert("Please fill in your last name");
            form.lastName.focus();
        }
        else if (form.emailAddress.value == "")
        {
            alert("Please fill in your email address");
            form.emailAddress.focus();
        }
        else
        {
            form.submit();
        }
    }
</script>  
        
        
        
        <form action="HW4_ReServlet" method="post">
            
            
             Select your identify:<br>
            <select name="identify">
                <option value="A">Teacher
                <option value="B">Student
                
            </select>
             <br>
             
             
    <table cellspacing="5" border="0">
        <tr>
            <td align="right">First name:</td>
            <td><input type="text" name="firstName" ></td>
        </tr>
        <tr>
            <td align="right">Last name:</td>
            <td><input type="text" name="lastName"></td>
        </tr>
        <tr>
            <td align="right">Email address:</td>
            <td><input type="text" name="emailAddress" ></td>
        </tr>
        
        
        <tr>
            <td align="right">Password:</td>
            <td><input type="text" name="password" ></td>
        </tr>
        
        
        
        <tr>
            <td></td>
            <td><br><input type="button" value="Submit" onClick="validate(this.form)" ></td>
        </tr>
    </table>
  
    </p>           
</form>
        
        
        
    </body>
</html>
