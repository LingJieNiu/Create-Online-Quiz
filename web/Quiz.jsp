<%-- 
    Document   : index
    Created on : Apr 3, 2015, 6:00:38 PM
    Author     : Ling
--%>
<%@page import="java.lang.String"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="Database.HW4_Servlet" language="java" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
              <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
        
        
        
        
        <title>JSP Page</title>
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
        
        
        
 <form action="HW4_CorrectServlet">  
        
 <%
          int count=0;
          
          
          String type1= (String)request.getAttribute("Type1");        
          String type2= (String)request.getAttribute("Type2");          
          String type3= (String)request.getAttribute("Type3");
          
          String QZtype1="c";
          String QZtype2="c";
          String QZtype3="c";
          session.setAttribute("QZtype1", QZtype1);
          session.setAttribute("QZtype2", QZtype2);
          session.setAttribute("QZtype3", QZtype3);
          
          
          if(type1.equals("a"))
        {
             QZtype1="a";
            session.setAttribute("QZtype1", QZtype1);
            count++;
           ArrayList<Integer>ID=(ArrayList<Integer>)request.getAttribute("JavaID"); 
           session.setAttribute("JavaID", ID);
           
           ArrayList<String>con=(ArrayList<String>)request.getAttribute("Javacontent");
           ArrayList<String>choice1=(ArrayList<String>)request.getAttribute("Javachoice1"); 
           ArrayList<String>choice2=(ArrayList<String>)request.getAttribute("Javachoice2");
           ArrayList<String>choice3=(ArrayList<String>)request.getAttribute("Javachoice3");
           ArrayList<String>choice4=(ArrayList<String>)request.getAttribute("Javachoice4");
           //ArrayList<String>answer=(ArrayList<String>)request.getAttribute("Javaanswer");
  //out.println("Servlet communicated message to JSP: ");

 // Vector vecObj = (Vector) request.getAttribute("vecBean");
//  out.println("Servlet to JSP communication of an object: "+vecObj.get(0));
%>

   
     

  
        
      <p>Please,Answer these question</p>
      
     
      <p><%=count%>+<%=con.get(0)%> </p>
        <p> <input type="radio" name="JavaAnswer" value="a">A.+<%=choice1.get(0) %></p>
        <p> <input type="radio" name="JavaAnswer" value="b">B.+<%=choice2.get(0) %></p>
        <p> <input type="radio" name="JavaAnswer" value="c">C.+<%=choice3.get(0) %></p>
        <p> <input type="radio" name="JavaAnswer" value="d">D.+<%=choice4.get(0) %></p>
        <br>
        
        <%
           
           count++;
                
        %>
         <p name=""><%=count%>+<%=con.get(1)%> </p>
        <p> <input type="radio" name="JavaAnswer1" value="a">A.+<%=choice1.get(1) %></p>
        <p> <input type="radio" name="JavaAnswer1" value="b">B.+<%=choice2.get(1) %></p>
        <p> <input type="radio" name="JavaAnswer1" value="c">C.+<%=choice3.get(1) %></p>
        <p> <input type="radio" name="JavaAnswer1" value="d">D.+<%=choice4.get(1) %></p>
        <% 
           

             }
        
        
        %>
        
        <%  
          
           if(type2.equals("a"))
        {
            QZtype2="a";
             session.setAttribute("QZtype2", QZtype2);
            count++;
            
            ArrayList<Integer>ID=(ArrayList<Integer>)request.getAttribute("JavascriptID");
             session.setAttribute("JavascriptID", ID);
            
          ArrayList<String>con=(ArrayList<String>)request.getAttribute("Javascriptcontent");
           ArrayList<String>choice1=(ArrayList<String>)request.getAttribute("Javascriptchoice1"); 
           ArrayList<String>choice2=(ArrayList<String>)request.getAttribute("Javascriptchoice2");
           ArrayList<String>choice3=(ArrayList<String>)request.getAttribute("Javascriptchoice3");
           ArrayList<String>choice4=(ArrayList<String>)request.getAttribute("Javascriptchoice4");
          
          
          
          
          %>
        
         <p name=""><%=count%>+<%=con.get(0)%> </p>
        <p> <input type="radio" name="JavascriptAnswer" value="a">A.+<%=choice1.get(0) %></p>
        <p> <input type="radio" name="JavascriptAnswer" value="b">B.+<%=choice2.get(0) %></p>
        <p> <input type="radio" name="JavascriptAnswer" value="c">C.+<%=choice3.get(0) %></p>
        <p> <input type="radio" name="JavascriptAnswer" value="d">D.+<%=choice4.get(0) %></p>
        <br>
        <%
           count++;
                
        %>
        
         <p name=""><%=count%>+<%=con.get(1)%> </p>
        <p> <input type="radio" name="JavascriptAnswer1" value="a">A.+<%=choice1.get(1) %></p>
        <p> <input type="radio" name="JavascriptAnswer1" value="b">B.+<%=choice2.get(1) %></p>
        <p> <input type="radio" name="JavascriptAnswer1" value="c">C.+<%=choice3.get(1) %></p>
        <p> <input type="radio" name="JavascriptAnswer1" value="d">D.+<%=choice4.get(1) %></p>
        <% }%>
        
          
        
        
        
         <%  
          
            if(type3.equals("a"))
        {
            QZtype3="a";
             session.setAttribute("QZtype3", QZtype3);
            count++;
            
            ArrayList<Integer>ID=(ArrayList<Integer>)request.getAttribute("AngularID"); 
             session.setAttribute("AngularID", ID);
            
          ArrayList<String>con=(ArrayList<String>)request.getAttribute("Angularcontent");
           ArrayList<String>choice1=(ArrayList<String>)request.getAttribute("Angularchoice1"); 
           ArrayList<String>choice2=(ArrayList<String>)request.getAttribute("Angularchoice2");
           ArrayList<String>choice3=(ArrayList<String>)request.getAttribute("Angularchoice3");
           ArrayList<String>choice4=(ArrayList<String>)request.getAttribute("Angularchoice4");
          
          
          
          
          %>
        
         <p name=""><%=count%>+<%=con.get(0)%> </p>
        <p> <input type="radio" name="AngularAnswer" value="a">A.+<%=choice1.get(0) %></p>
        <p> <input type="radio" name="AngularAnswer" value="b">B.+<%=choice2.get(0) %></p>
        <p> <input type="radio" name="AngularAnswer" value="c">C.+<%=choice3.get(0) %></p>
        <p> <input type="radio" name="AngularAnswer" value="d">D.+<%=choice4.get(0) %></p>
        <br>
        
        <%
           count++;
                
        %>
         <p name=""><%=count%>+<%=con.get(1)%> </p>
        <p> <input type="radio" name="AngularAnswer1" value="a">A.+<%=choice1.get(1) %></p>
        <p> <input type="radio" name="AngularAnswer1" value="b">B.+<%=choice2.get(1) %></p>
        <p> <input type="radio" name="AngularAnswer1" value="c">C.+<%=choice3.get(1) %></p>
        <p> <input type="radio" name="AngularAnswer1" value="d">D.+<%=choice4.get(1) %></p>
        <% }%>
          
        <%
        
        
          session.setAttribute("count", count);
      //  request.setAttribute("count1", count);
        
        
        
        
        %>
          
          
          
          
        
        <p><input type="submit" value="Submit"></p>
        </form>


        
        
        
       
    </body>
</html>
