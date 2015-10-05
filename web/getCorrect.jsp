<%-- 
    Document   : getCorrect
    Created on : Apr 17, 2015, 10:05:15 PM
    Author     : Ling
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chick Your Score</title>
    </head>
    <body>
    
    
           
 <%
     int count=0;
     int FullScore=(Integer)request.getAttribute("count");
     
     
      String type1= (String)request.getAttribute("typeForCorrect1");   
      
      System.out.println("get the type1"+type1);
      
      
          String type2= (String)request.getAttribute("typeForCorrect2");  
           System.out.println("get the type1"+type2);
          
          String type3= (String)request.getAttribute("typeForCorrect3");
     System.out.println("get the type1"+type3);
          
          
     if(type1.equals("b"))
     {
         String Q1="a";
         String Q2="a";
         String[]AnswerFromQuiz=(String[])request.getAttribute("AnswerFromQuizJava");
         System.out.println("get answer from Quiz: "+AnswerFromQuiz[0]);
          System.out.println("get answer from Quiz: "+AnswerFromQuiz[1]);
         
         ArrayList<String>answergetFromSQL=(ArrayList<String>)request.getAttribute("JavacorrectAnswer");
        //  System.out.println("get answer from SQL: "+answergetFromSQL.get(1));
     
            if(AnswerFromQuiz[0].equals(answergetFromSQL.get(0))){
                
                Q1="T";
                count++;
            }else{
         
                      Q1="F";
          
                } 
            
            
        if(AnswerFromQuiz[1].equals(answergetFromSQL.get(1))){
                
                Q2="T";
                 count++;
            }else{
         
                      Q2="F";
          
                }     
           
            
      
       %>
       
                
 <p>Your answer 1: <%=AnswerFromQuiz[0]%> , The correct answer 1 : <%=answergetFromSQL.get(0)%>, your answer is :<%=Q1 %></p>
 <p>Your answer 2: <%=AnswerFromQuiz[1]%> , The correct answer 2 : <%=answergetFromSQL.get(1)%>, your answer is :<%=Q2 %></p>
                
            
                
     <%   
                      }
     
     
     
     
    
     
         if(type2.equals("b"))
     {
         String Q1="c";
         String Q2="c";
         String[]AnswerFromQuiz=(String[])request.getAttribute("AnswerFromQuizJavascript");
         ArrayList<String>answergetFromSQL=(ArrayList<String>)request.getAttribute("JavascriptcorrectAnswer");
        //  System.out.println("get answer from SQL2: "+answergetFromSQL.get(1));
     
            if(AnswerFromQuiz[0].equals(answergetFromSQL.get(0))){
                
                Q1="T";
                 count++;
            }else{
         
                      Q1="F";
          
                } 
            
            
        if(AnswerFromQuiz[1].equals(answergetFromSQL.get(1))){
                
                Q2="T";
                 count++;
            }else{
         
                      Q2="F";
          
                }     
           
            
      
       %>
       
                
 <p>Your answer 1: <%=AnswerFromQuiz[0]%> , The correct answer 1 : <%=answergetFromSQL.get(0)%>, your answer is :<%=Q1 %></p>
 <p>Your answer 2: <%=AnswerFromQuiz[1]%> , The correct answer 2 : <%=answergetFromSQL.get(1)%>, your answer is :<%=Q2 %></p>
 
 
   <%
                    
     }
         
                    
                    
                   
     if(type3.equals("b"))
     {
         String Q1="c";
         String Q2="c";
         String[]AnswerFromQuiz=(String[])request.getAttribute("AnswerFromQuizAngular");
         ArrayList<String>answergetFromSQL=(ArrayList<String>)request.getAttribute("AngularcorrectAnswer");
     
     
            if(AnswerFromQuiz[0].equals(answergetFromSQL.get(0))){
                
                Q1="T";
                 count++;
            }else{
         
                      Q1="F";
          
                } 
            
            
        if(AnswerFromQuiz[1].equals(answergetFromSQL.get(1))){
                
                Q2="T";
                 count++;
            }else{
         
                      Q2="F";
          
                }     
           
            
      
       %>
       
 <p>Your answer 1: <%=AnswerFromQuiz[0]%> , The correct answer 1 : <%=answergetFromSQL.get(0)%>, your answer is :<%=Q1 %></p>
 <p>Your answer 2: <%=AnswerFromQuiz[1]%> , The correct answer 2 : <%=answergetFromSQL.get(1)%>, your answer is :<%=Q2 %></p>
 
 
 
   <%
                    
     }
         %>                
         
         <p> The full score is <%=FullScore%> </p>   
          <h3> Your score is <%=count%> </h3>   
         
         
         
         
     
                          
                
                
            
        
        
        
        
    </body>
</html>
