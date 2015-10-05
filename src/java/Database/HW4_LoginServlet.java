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
public class HW4_LoginServlet extends HttpServlet {

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
        
         Connection connection = null;
          Statement statement = null;  
          ResultSet rscontent=null;
          String identify=request.getParameter("identify");
          
          
          
if(identify.equals("A"))
{    
          
           ArrayList <String> firstname=new ArrayList<String>();
          
           ArrayList <Integer> password=new ArrayList<Integer>();
           
           String fname=request.getParameter("firstname");
           int pword=Integer.parseInt(request.getParameter("password"));
           
        
       try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         rscontent = 
                    statement.executeQuery("select firstname,password from teacherinformation");
         
         
 
   while( rscontent.next())
{
   // array.add(rscontent.getString(2));
   
    firstname.add(rscontent.getString(1));
    
   password.add(Integer.parseInt(rscontent.getString(2)));
   
   
}
   
   
  
       if(firstname.contains(fname))
       {
           if(password.contains(pword))
           {
                RequestDispatcher reqDispatcher = request.getRequestDispatcher("/mainpage.jsp");
        reqDispatcher.forward(request,response);
           }else{
               out.println("<p> please, using the correct password </p>");
               
           }
       }else{
           out.println("<p> please, using the correct firstname </p>");
       }
   
   
      
         
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
        
        
        
        
}else{
    
     ArrayList <String> firstname=new ArrayList<String>();
          
           ArrayList <Integer> password=new ArrayList<Integer>();
           
           String fname=request.getParameter("firstname");
           int pword=Integer.parseInt(request.getParameter("password"));
           
        
       try{
           
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
 
 
         statement = connection.createStatement(); 
         rscontent = 
                    statement.executeQuery("select firstname,password from studentinformation");
         
         
 
   while( rscontent.next())
{
   // array.add(rscontent.getString(2));
   
    firstname.add(rscontent.getString(1));
    
   password.add(Integer.parseInt(rscontent.getString(2)));
   
   
}
   
   
  
       if(firstname.contains(fname))
       {
           if(password.contains(pword))
           {
                RequestDispatcher reqDispatcher = request.getRequestDispatcher("/Mainpage_Student.jsp");
        reqDispatcher.forward(request,response);
           }else{
               out.println("<p> please, using the correct password </p>");
               
           }
       }else{
           out.println("<p> please, using the correct firstname </p>");
       }
   
   
      
         
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
        
        
        
        
        
        
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HW4_LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HW4_LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
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
