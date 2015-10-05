package Database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import Database.database;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
/**
 *
 * @author Ling
 */
public class HW4_Servlet extends HttpServlet {

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
        String[]QType=request.getParameterValues("questionType");
        
      for(int j=0;j<QType.length;j++)
      {
          out.println( "<p>The Quiz type is :"+QType[j] +"</p>");
      }
       
        
        Connection connection = null;
          Statement statement = null;  
        ResultSet rscontent=null;
          
          
       String type1="c";
      String type2="c";
      String type3="c";
      
      request.setAttribute("Type1", type1); 
      request.setAttribute("Type2", type2); 
      request.setAttribute("Type3", type3); 
        
    for(int i=0;i<QType.length;i++) 
    {
        
       if(QType[i].equals("A"))
     
     {
         
           
        
           ArrayList <Integer> ID=new ArrayList<Integer>();
           ArrayList <String> content=new ArrayList<String>();
           ArrayList <String> choice1=new ArrayList<String>();
           ArrayList <String> choice2=new ArrayList<String>();
           ArrayList <String> choice3=new ArrayList<String>();
           ArrayList <String> choice4=new ArrayList<String>();
           ArrayList <String> answer=new ArrayList<String>();
    
          String a1 = null;
          String a2 = null;
          int id;
          
    try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         rscontent = 
                   // statement.executeQuery("select * from java order by rand() limit 2");
         statement.executeQuery("SELECT * FROM java ORDER BY RAND() LIMIT 2 ");
         //随机查询提取2条记录
 
   while( rscontent.next())
{
   
   // array.add(rscontent.getString(2));
   ID.add(rscontent.getInt(1));
    content.add(rscontent.getString(2));
    
   choice1.add(rscontent.getString(3));
   choice2.add(rscontent.getString(4));
   choice3.add(rscontent.getString(5));
   choice4.add(rscontent.getString(6));
   answer.add(rscontent.getString(7));
}
         
      a1=content.get(0);
     
      a2=content.get(1);
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
           
           
        type1="a";
         request.setAttribute("Type1", type1); 
        request.setAttribute("JavaID", ID);   
        request.setAttribute("Javacontent", content);
        request.setAttribute("Javachoice1", choice1);
        request.setAttribute("Javachoice2", choice2);
        request.setAttribute("Javachoice3", choice3);
        request.setAttribute("Javachoice4", choice4);   
        request.setAttribute("Javaanswer", answer);   
         
   /*      
      try{   
         
        out.println( "<p>1."+Javacontent.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"A\">A."+Javachoice1.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"B\">B."+Javachoice2.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"C\">C."+Javachoice3.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"D\">D."+Javachoice4.get(0) +"</p>");
        
      out.println("<br>");
        out.println( "<p>1."+Javacontent.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"A\">A."+Javachoice1.get(1) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"B\">B."+Javachoice2.get(2) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"C\">C."+Javachoice3.get(3) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"D\">D."+Javachoice4.get(4) +"</p>");
         
      }finally {
            out.close();
        }
         
       */ 

}else if(QType[i].equals("B")){
           
           ArrayList <Integer> ID=new ArrayList<Integer>();
           ArrayList <String> content=new ArrayList<String>();
           ArrayList <String> choice1=new ArrayList<String>();
           ArrayList <String> choice2=new ArrayList<String>();
           ArrayList <String> choice3=new ArrayList<String>();
           ArrayList <String> choice4=new ArrayList<String>();
           ArrayList <String> answer=new ArrayList<String>();
    
          String a1 = null;
          String a2 = null;
          
          
    try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         rscontent = 
                    statement.executeQuery("SELECT * FROM javascript ORDER BY RAND() LIMIT 2");
         
         
 
   while( rscontent.next())
{
   // array.add(rscontent.getString(2));
    ID.add(rscontent.getInt(1));
    content.add(rscontent.getString(2));
    
   choice1.add(rscontent.getString(3));
   choice2.add(rscontent.getString(4));
   choice3.add(rscontent.getString(5));
   choice4.add(rscontent.getString(6));
   answer.add(rscontent.getString(7));
}
         
      a1=content.get(0);
      a2=content.get(1);
      out.println( "<p>content from javascript1: "+a1 +"</p>");
      out.println( "<p>content from javascript2: "+a2 +"</p>");
      
      
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
           
           
   
          type2="a";
         request.setAttribute("Type2", type2);    
        request.setAttribute("JavascriptID", ID);
        request.setAttribute("Javascriptcontent", content);
        request.setAttribute("Javascriptchoice1", choice1);
        request.setAttribute("Javascriptchoice2", choice2);
        request.setAttribute("Javascriptchoice3", choice3);
        request.setAttribute("Javascriptchoice4", choice4);   
         request.setAttribute("Javascriptanswer", answer);   
           
         
/*         
     try{
         
         out.println( "<p>1."+content.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"A\">A."+choice1.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"B\">B."+choice2.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"C\">C."+choice3.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"D\">D."+choice4.get(0) +"</p>");
        
      out.println("<br>");
        out.println( "<p>1."+content.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"A\">A."+choice1.get(1) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"B\">B."+choice2.get(2) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"C\">C."+choice3.get(3) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"D\">D."+choice4.get(4) +"</p>");
          
     }finally {
            out.close();
        }
         
           
         */
         
         
       }else{
    
           ArrayList <Integer> ID=new ArrayList<Integer>();
           ArrayList <String> content=new ArrayList<String>();
           ArrayList <String> choice1=new ArrayList<String>();
           ArrayList <String> choice2=new ArrayList<String>();
           ArrayList <String> choice3=new ArrayList<String>();
           ArrayList <String> choice4=new ArrayList<String>();
           ArrayList <String> answer=new ArrayList<String>();
    
          String a1 = null;
          String a2 = null;
          
          
    try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         rscontent = 
                    statement.executeQuery("SELECT * FROM angularjs ORDER BY RAND() LIMIT 2");
         
         
 
   while( rscontent.next())
{
   // array.add(rscontent.getString(2));
   ID.add(rscontent.getInt(1));
    content.add(rscontent.getString(2));
    
   choice1.add(rscontent.getString(3));
   choice2.add(rscontent.getString(4));
   choice3.add(rscontent.getString(5));
   choice4.add(rscontent.getString(6));
   answer.add(rscontent.getString(7));
}
         
      a1=content.get(0);
      a2=content.get(1);
    
      out.println( "<p>content from angularjs1: "+a1 +"</p>");
      out.println( "<p>content from angularjs2: "+a2 +"</p>");
      
      
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
           
           
   
        type3="a";
         request.setAttribute("Type3", type3);   
        request.setAttribute("AngularID", ID);
        request.setAttribute("Angularcontent", content);
        request.setAttribute("Angularchoice1", choice1);
        request.setAttribute("Angularchoice2", choice2);
        request.setAttribute("Angularchoice3", choice3);
        request.setAttribute("Angularchoice4", choice4);   
        request.setAttribute("Angularanswer", answer);   
      
/*    
    try{
    
      out.println( "<p>1."+content.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"A\">A."+choice1.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"B\">B."+choice2.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"C\">C."+choice3.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"D\">D."+choice4.get(0) +"</p>");
        
      out.println("<br>");
        out.println( "<p>1."+content.get(0) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"A\">A."+choice1.get(1) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"B\">B."+choice2.get(2) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"C\">C."+choice3.get(3) +"</p>");
        out.println( "<p> <input type=\"radio\" name=\"Q1\" value=\"D\">D."+choice4.get(4) +"</p>");
    
    }finally {
            out.close();
        }
    
    */
   }
 }
    
   
    

    RequestDispatcher reqDispatcher = request.getRequestDispatcher("/Quiz.jsp");
        reqDispatcher.forward(request,response);
    
   
    
    
    
    
      /* 
        try {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HW4_servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HW4_servlet1 at " + request.getContextPath() + "</h1>");
            
            
             out.println("<h1> The questions are: </h1>");
             
             out.println("<h2>1. "+a1+"</h2>" );
             
           out.println(choice1.get(0)+" <tab> "+choice2.get(0)+"    "+choice3.get(0)
                         +"   "+choice4.get(0));
             out.println("<h2>2. "+a2+"</h2>" );
            
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        
        
        */
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
