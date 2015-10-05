/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ling
 */
public class HW4_CorrectServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        int FullScore=(Integer)request.getSession().getAttribute("count");
        request.setAttribute("count",FullScore);
        
        
         Connection connection = null;
          Statement statement = null;  
        ResultSet rscontent=null;
        
        String type1=(String)request.getSession().getAttribute("QZtype1");
        String type2=(String)request.getSession().getAttribute("QZtype2");
        String type3=(String)request.getSession().getAttribute("QZtype3");
        
    
        String typeForCorrect1="m";
         String typeForCorrect2="m";
         String typeForCorrect3="m";
         
         
          request.setAttribute("typeForCorrect1", typeForCorrect1);
          request.setAttribute("typeForCorrect2", typeForCorrect2);
           request.setAttribute("typeForCorrect3", typeForCorrect3); 
         
           
           
        System.out.println("in correct servlet get the type1: "+type1);   
         System.out.println("in correct servlet get the type2: "+type2);   
         System.out.println("in correct servlet get the type3: "+type3);   
        
        if(type1.equals("a"))
        {
            typeForCorrect1="b";
            request.setAttribute("typeForCorrect1", typeForCorrect1);
            
            String[] answergetFromQuiz= new String[2];
               answergetFromQuiz[0]=request.getParameter("JavaAnswer");
               answergetFromQuiz[1]=request.getParameter("JavaAnswer1");
               
                request.setAttribute("AnswerFromQuizJava", answergetFromQuiz);
               
            ArrayList<Integer>IDgetFromQuiz=(ArrayList<Integer>)request.getSession().getAttribute("JavaID"); 
            
            ArrayList<String>answergetFromSQL=new ArrayList<String>();
            
            // String[]AnswerFromQuiz=request.getParameterValues("JavaAnswer");
          
            
            
try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         rscontent = 
                   // statement.executeQuery("select * from java order by rand() limit 2");
         statement.executeQuery("SELECT answer FROM java ");
         
 
   while( rscontent.next())
{
   
  
   answergetFromSQL.add(rscontent.getString(1));
   // System.out.println("get answer from SQL for Java: "+rscontent.getString(1));   
   
}
    int a1= IDgetFromQuiz.get(0)-1;
    int a2= IDgetFromQuiz.get(1)-1;
   System.out.println("The ID1 for Java is: "+a1); 
     System.out.println("The ID2 for Java is: "+a2); 
     
     
    String AnswerfromSQL1= answergetFromSQL.get(a1);
    String AnswerfromSQL2= answergetFromSQL.get(a2);
    
    System.out.println("get answer for SQL follow ID 1: "+AnswerfromSQL1); 
     System.out.println("get answer for SQL follow ID 2: "+AnswerfromSQL2); 
    
    
   // request.setAttribute("JavacorrectAnswer1", AnswerfromSQL1);
  //  request.setAttribute("JavacorrectAnswer2", AnswerfromSQL2);
   ArrayList<String>answerSQL=new ArrayList<String>(); 
   answerSQL.add(AnswerfromSQL1);
   answerSQL.add(AnswerfromSQL2);
    request.setAttribute("JavacorrectAnswer",  answerSQL);
    
    
    out.println( "<p>content from java1:"+a1 +"</p>");
      out.println( "<p>content from java2"+a2 +"</p>");
      
      
      
      rscontent.close();
         statement.close();
         connection.close();    
        
    } catch(SQLException se){
         //Handle errors for JDBC
         se.printStackTrace();
      }catch(Exception e){
         //Handle errors for Class.forName
         e.printStackTrace();
      } finally{
         //finally block used to close resources
         try{
            if(statement !=null)
               statement.close();
         }catch(SQLException se2){
         }// nothing we can do
         try{
            if(connection !=null)
            connection.close();
         }catch(SQLException se){
            se.printStackTrace();
         }//end finally try
      } //end try     
            
            
            
        }
        
if(type2.equals("a"))
   {
            typeForCorrect2="b";
             request.setAttribute("typeForCorrect2", typeForCorrect2);
             
            String[] answergetFromQuiz= new String[2];
               answergetFromQuiz[0]=request.getParameter("JavascriptAnswer");
               answergetFromQuiz[1]=request.getParameter("JavascriptAnswer1");
            
            
            
            
            ArrayList<Integer>IDgetFromQuiz=(ArrayList<Integer>)request.getSession().getAttribute("JavascriptID"); 
            
            ArrayList<String>answergetFromSQL=new ArrayList<String>();
            
            // String[]AnswerFromQuiz=request.getParameterValues("JavascriptAnswer");
            request.setAttribute("AnswerFromQuizJavascript", answergetFromQuiz);
            
            
    try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         rscontent = 
                   // statement.executeQuery("select * from java order by rand() limit 2");
         statement.executeQuery("SELECT answer FROM javascript");
         
 
   while( rscontent.next())
{
   
  
   answergetFromSQL.add(rscontent.getString(1));
}
    int a1= IDgetFromQuiz.get(0)-1;
    int a2= IDgetFromQuiz.get(1)-1;
    String AnswerfromSQL1= answergetFromSQL.get(a1);
    String AnswerfromSQL2= answergetFromSQL.get(a2);
    
    //request.setAttribute("JavascriptcorrectAnswer1", AnswerfromSQL1);
   // request.setAttribute("JavascriptcorrectAnswer2", AnswerfromSQL2);
    ArrayList<String>answerSQL=new ArrayList<String>(); 
   answerSQL.add(AnswerfromSQL1);
   answerSQL.add(AnswerfromSQL2);
    
    
    request.setAttribute("JavascriptcorrectAnswer",answerSQL);
    
    
    out.println( "<p>content from java1:"+a1 +"</p>");
      out.println( "<p>content from java2"+a2 +"</p>");
      
      
      
      rscontent.close();
         statement.close();
         connection.close();    
        
    } catch(SQLException se){
         //Handle errors for JDBC
         se.printStackTrace();
      }catch(Exception e){
         //Handle errors for Class.forName
         e.printStackTrace();
      } finally{
         //finally block used to close resources
         try{
            if(statement !=null)
               statement.close();
         }catch(SQLException se2){
         }// nothing we can do
         try{
            if(connection !=null)
            connection.close();
         }catch(SQLException se){
            se.printStackTrace();
         }//end finally try
      } //end try     
            
            
            
        }
        
        
 if(type3.equals("a"))
        {
            typeForCorrect3="b";
             request.setAttribute("typeForCorrect3", typeForCorrect3);
             
             
         //   String[] answergetFromQuiz= request.getParameterValues("AngularAnswer");
            String[] answergetFromQuiz= new String[2];
               answergetFromQuiz[0]=request.getParameter("AngularAnswer");
               answergetFromQuiz[1]=request.getParameter("AngularAnswer1");
             request.setAttribute("AnswerFromQuizAngular",answergetFromQuiz);
            
            
            
            ArrayList<Integer>IDgetFromQuiz=(ArrayList<Integer>)request.getSession().getAttribute("AngularID"); 
            
            ArrayList<String>answergetFromSQL=new ArrayList<String>();
            
           //  String[]AnswerFromQuiz=request.getParameterValues("AngularAnswer");
           
            
            
try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         rscontent = 
                   // statement.executeQuery("select * from java order by rand() limit 2");
         statement.executeQuery("SELECT answer FROM angularjs");
         
 
   while( rscontent.next())
{
   
  
   answergetFromSQL.add(rscontent.getString(1));
}
    int a1= IDgetFromQuiz.get(0)-1;
    int a2= IDgetFromQuiz.get(1)-1;
    String AnswerfromSQL1= answergetFromSQL.get(a1);
    String AnswerfromSQL2= answergetFromSQL.get(a2);
    
   // request.setAttribute("AngularcorrectAnswer1", AnswerfromSQL1);
   // request.setAttribute("AngularcorrectAnswer2", AnswerfromSQL2);
     ArrayList<String>answerSQL=new ArrayList<String>(); 
   answerSQL.add(AnswerfromSQL1);
   answerSQL.add(AnswerfromSQL2);
    request.setAttribute("AngularcorrectAnswer", answerSQL);
    
    
 
      
      
      
      rscontent.close();
         statement.close();
         connection.close();    
        
    } catch(SQLException se){
         //Handle errors for JDBC
         se.printStackTrace();
      }catch(Exception e){
         //Handle errors for Class.forName
         e.printStackTrace();
      } finally{
         //finally block used to close resources
         try{
            if(statement !=null)
               statement.close();
         }catch(SQLException se2){
         }// nothing we can do
         try{
            if(connection !=null)
            connection.close();
         }catch(SQLException se){
            se.printStackTrace();
         }//end finally try
      } //end try     
            
            
            
        }       
        
      
 
         RequestDispatcher reqDispatcher = request.getRequestDispatcher("/getCorrect.jsp");
        reqDispatcher.forward(request,response);
       
 
             
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
