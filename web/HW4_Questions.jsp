<%-- 
    Document   : HW4_Questions
    Created on : Apr 5, 2015, 7:40:57 PM
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
        
        
        
        
        <style > 
            
            
           #question {width:300px; height:100px} 
           #Q{width:200px; height:50px} 
        </style> 
        
        
        
        <title>Type your questions</title>
        
        
    </head>
    <body>
        
        
    <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="mainpage.jsp"> Start from here </a>
    </div>
    <div>
      <ul class="nav navbar-nav">
        
        <li><a href="HW4_Questions.jsp">Put the questions</a></li>
        <li><a href="Quiz.jsp">Start the Quiz</a></li>
        <li><a href="#">Page 3</a></li>
      </ul>
    </div>
  </div>
</nav>          
        
       <form action="HW4_DataToServlet" method="post"> 
           <div>          
           <h5>Select the question type:</h5><br>
           Select your identify:<br>
            <select name="questionType">
                <option value="A">Java
                <option value="B">JavaScript
                <option value="C">AngularJs   
                
            </select>
      <br>
           </div>
           <div>     
        <h3>put your question in there</h3>
        <input type="textarea" name="TypeQuestion" id="question">
        <br>
        <h3>put the choice 1</h3>
        <input type="textarea" name="Q1" id="Q">
        <br>
        <h3>put the choice 2</h3>
        <input type="textarea" name="Q2" id="Q">
        <br>
        <h3>put the choice 3</h3>
       <input type="textarea" name="Q3" id="Q">
       <br>
       <h3>put the choice 4</h3>
       <input type="textarea" name="Q4" id="Q">
       </div>
       <br>
        <h3>put the answer</h3>
      <input type="textarea" name="answer" >
      <br>
        
       
       
            <input type="submit"  value="Submit">

        </form> 
        
         <form action="mainpage.jsp" method="get">
            <input type="submit" value="Return">
        </form>
        
    </body>
</html>
