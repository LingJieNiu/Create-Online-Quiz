<%-- 
    Document   : ChoiceQuizType
    Created on : Apr 16, 2015, 6:54:09 PM
    Author     : Ling
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        <title>Start Quiz</title>
    </head>
    <body>
        
         <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="mainpage.jsp"> Start from here </a>
    </div>
    <div>
      <ul class="nav navbar-nav">
      
        <li><a href="Quiz.jsp">Start the Quiz</a></li>
        <li><a href="#">Page 3</a></li>
      </ul>
    </div>
  </div>
</nav>          
        
        
        
       <form action="HW4_Servlet" method="post"> 
           
                 
           <h5>Select the question type:</h5><br>
      <label><input name="questionType" type="checkbox" value="A" />Java </label>
      <label><input name="questionType" type="checkbox" value="B" />Javascript </label>
      <label><input name="questionType" type="checkbox" value="C" />AngularJs</label>
      <br> 
           
      <input type="submit"  value="Click here to start">
           
       </form>
           
    </body>
</html>
