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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ling
 */
public class HW4_ReServlet extends HttpServlet {

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
        
        String identify=request.getParameter("identify");
        String firstname;
        String lastname;
        String email;
        int password;
        
        Connection connection = null;
         PreparedStatement ps=null;
         
         
 if(identify.equals("A"))
 {
        
        firstname = request.getParameter("firstName");
        lastname = request.getParameter("lastName");
       email = request.getParameter("emailAddress");
        password = Integer.parseInt(request.getParameter("password"));  
         
         
         
         
     try{  
        
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
         
         
         
         // String sql = "INSERT INTO questions(Context,Choice1,Choice2,Choice3,Choice4) values(?,?,?,?,?)";
         ps = (PreparedStatement)connection.prepareStatement("insert into teacherinformation (firstname,lastname,email,password) values(?,?,?,?)");
         
        ps.setString(1,firstname);
          ps.setString(2,lastname);        
          ps.setString(3,email);
          ps.setInt(4,password);
         
          
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
        
      
      RequestDispatcher reqDispatcher = request.getRequestDispatcher("/HW4_Login.jsp");
        reqDispatcher.forward(request,response);
     
     
        
 }else{
     
      
        firstname = request.getParameter("firstName");
        lastname = request.getParameter("lastName");
       email = request.getParameter("emailAddress");
        password = Integer.parseInt(request.getParameter("password"));  
         
         
         
         
     try{  
        
        Class.forName("org.gjt.mm.mysql.Driver");     
        System.out.println("Driver loaded");

  
       connection =
                  DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

         System.out.println("Database connected");
         
         
         
         // String sql = "INSERT INTO questions(Context,Choice1,Choice2,Choice3,Choice4) values(?,?,?,?,?)";
         ps = (PreparedStatement)connection.prepareStatement("insert into studentinformation (firstname,lastname,email,password) values(?,?,?,?)");
         
        ps.setString(1,firstname);
          ps.setString(2,lastname);        
          ps.setString(3,email);
          ps.setInt(4,password);
         
          
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
     
     
     
     RequestDispatcher reqDispatcher = request.getRequestDispatcher("/HW4_Login.jsp");
        reqDispatcher.forward(request,response);
     
     
     
     
     
     
     
     
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
