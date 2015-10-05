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
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Ling
 */
public class HW4_DataToServlet extends HttpServlet {
   static int Javacount=0;
   static int JavaScriptcount1=0;
   static int Angularcount=0;
   /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 /*    
  @Override
    public void init() throws ServletException {
      
        
        // print the debugging information to the console window
        System.out.println("AddToContactList2 init() called");
        
        // print the debugging information to a log file
        log("AddToContactList2 init() called");
    }
    */
    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        
         
        String choice=request.getParameter("questionType");
        
        
          String content;
        String Q1;
        String Q2 ;
        String Q3 ;
        String Q4;
        String answer;
        
        
         Connection connection = null;
         
        PreparedStatement ps=null;
        PrintWriter out = response.getWriter();
        
        
 if(choice.equals("A"))  
 {
      Javacount++;
        content = request.getParameter("TypeQuestion");
        Q1 = request.getParameter("Q1");
        Q2 = request.getParameter("Q2");
        Q3 = request.getParameter("Q3");
        Q4 = request.getParameter("Q4");
        answer=request.getParameter("answer");
        int id= Javacount;
       
        
       
        
        
      try{  
        
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
         
         
         
         // String sql = "INSERT INTO questions(Context,Choice1,Choice2,Choice3,Choice4) values(?,?,?,?,?)";
         ps = (PreparedStatement)connection.prepareStatement("insert into java (ID,content,choice1,choice2,choice3,choice4,answer) values(?,?,?,?,?,?,?)");
         
        ps.setInt(1,id);
         
         ps.setString(2,content);
          ps.setString(3,Q1);        
          ps.setString(4,Q2);
          ps.setString(5,Q3);
          ps.setString(6,Q4);
          ps.setString(7,answer);
       int i= ps.executeUpdate();
       
          connection.commit(); 
          String msg=" ";
          if(i!=0){  
            msg="Record has been inserted";
            out.println("<font size='6' color=blue>" + msg + "</font>");  


          }  
          else{  
            msg="failed to insert the data";
            out.println("<font size='6' color=blue>" + msg + "</font>");
           }  
          ps.close();
        }  
        catch (Exception e){  
          out.println(e);  
        }  
        
         RequestDispatcher reqDispatcher = request.getRequestDispatcher("/HW4_Questions.jsp");
        reqDispatcher.forward(request,response);
      //  connection.close();
      /*
      }
      catch(SQLException se){
         //Handle errors for JDBC
         se.printStackTrace();
      }
         */
         
 }else if(choice.equals("B")){
     JavaScriptcount1++;
     
     content = request.getParameter("TypeQuestion");
        Q1 = request.getParameter("Q1");
        Q2 = request.getParameter("Q2");
        Q3 = request.getParameter("Q3");
        Q4 = request.getParameter("Q4");
        answer=request.getParameter("answer");
        int id= JavaScriptcount1;
       
     
      try{  
        
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
         
         
         
         // String sql = "INSERT INTO questions(Context,Choice1,Choice2,Choice3,Choice4) values(?,?,?,?,?)";
         ps = (PreparedStatement)connection.prepareStatement("insert into javascript (ID,content,choice1,choice2,choice3,choice4,answer) values(?,?,?,?,?,?,?)");
         
        ps.setInt(1,id);
         
         ps.setString(2,content);
          ps.setString(3,Q1);        
          ps.setString(4,Q2);
          ps.setString(5,Q3);
          ps.setString(6,Q4);
          ps.setString(7,answer);
       int i= ps.executeUpdate();
       
          connection.commit(); 
          String msg=" ";
          if(i!=0){  
            msg="Record has been inserted";
            out.println("<font size='6' color=blue>" + msg + "</font>");  


          }  
          else{  
            msg="failed to insert the data";
            out.println("<font size='6' color=blue>" + msg + "</font>");
           }  
          ps.close();
        }  
        catch (Exception e){  
          out.println(e);  
        }   
     
      RequestDispatcher reqDispatcher = request.getRequestDispatcher("/HW4_Questions.jsp");
        reqDispatcher.forward(request,response);
     
     
 }else{
     
     Angularcount++;
       content = request.getParameter("TypeQuestion");
        Q1 = request.getParameter("Q1");
        Q2 = request.getParameter("Q2");
        Q3 = request.getParameter("Q3");
        Q4 = request.getParameter("Q4");
        answer=request.getParameter("answer");
        int id= Angularcount;
       
     
      try{  
        
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
         
         
         
         // String sql = "INSERT INTO questions(Context,Choice1,Choice2,Choice3,Choice4) values(?,?,?,?,?)";
         ps = (PreparedStatement)connection.prepareStatement("insert into angularjs (ID,content,choice1,choice2,choice3,choice4,answer) values(?,?,?,?,?,?,?)");
         
        ps.setInt(1,id);
         
         ps.setString(2,content);
          ps.setString(3,Q1);        
          ps.setString(4,Q2);
          ps.setString(5,Q3);
          ps.setString(6,Q4);
          ps.setString(7,answer);
       int i= ps.executeUpdate();
       
          connection.commit(); 
          String msg=" ";
          if(i!=0){  
            msg="Record has been inserted";
            out.println("<font size='6' color=blue>" + msg + "</font>");  


          }  
          else{  
            msg="failed to insert the data";
            out.println("<font size='6' color=blue>" + msg + "</font>");
           }  
          ps.close();
        }  
        catch (Exception e){  
          out.println(e);  
        }   
     
     
      RequestDispatcher reqDispatcher = request.getRequestDispatcher("/HW4_Questions.jsp");
        reqDispatcher.forward(request,response);
     
     
     
 }   
        
        
        
        
        
        
        
     
    /*    
        try {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HW4_DataToServlet</title>");
            
            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HW4_DataToServlet at " + request.getContextPath() + "</h1>");
            
            out.println("<p>"+content+"</p>");
            out.println("<p>"+Q1+"</p>");
            out.println("<p>"+Q3+"</p>");
            out.println("<p>"+Q3+"</p>");
            out.println("<p>"+Q4+"</p>");
            
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
