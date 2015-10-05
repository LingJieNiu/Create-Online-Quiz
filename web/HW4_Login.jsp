<%-- 
    Document   : HW4_Login
    Created on : Apr 15, 2015, 7:49:09 PM
    Author     : Ling
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h3> Please,Log in</h3>
        
        <form action="HW4_LoginServlet" method="post">
            
             Select your identify:<br>
            <select name="identify">
                <option value="A">Teacher
                <option value="B">Student
                
            </select><br>
            
            <br>
            
            <table cellspacing="5" border="0">
                <tr>
                    <td align="right">First name:</td>
                    <td><input type="text" name="firstname"></td>
                </tr>
                <tr>
                    <td align="right">Password:</td>
                    <td><input type="text" name="password"></td>
                </tr>
               
                <tr>
                    <td></td>
                    <td><br><input type="submit" value="Submit"></td>
                </tr>
            </table>
               
        </form>
        
        <form action="register.jsp">
            
            <input type="submit" value="go to register page">
            
        </form>
        
    </body>
</html>
