/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author Ling
 */
public class database {
    
    ArrayList <String> array=new ArrayList<String>();
  
    
    public void PutDatabaseValue(String data)
    {
        
        
        array.add(data);
        
    
        
    }
    public ArrayList <String> GetDatabaseValue()
    {
        return array;
    }
    
    
    public void printArray()
    {
         for(String print:array)
   {
        System.out.println(print);
   }
    }
    
    
    
      public static void main(String[] args)
            throws SQLException, ClassNotFoundException
    {
        
        Class.forName("org.gjt.mm.mysql.Driver");     
   System.out.println("Driver loaded");

  
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hw4", "root", "fuzhou");

 System.out.println("Database connected");
 
 
 Statement statement = connection.createStatement(); 
ResultSet rscontent = 
             statement.executeQuery("select * from questions");

/*
ResultSet rschoice = 
             statement.executeQuery("select Choice1,Choice2,Choice3,Choice4 from questions");  


ResultSet rsALL = 
             statement.executeQuery("select * from questions");




*/

database d = new database();
//ArrayList <String> array=new ArrayList<String>();
String[] content=new String[5] ;


 int count=0;
   while( rscontent.next())
{
   // array.add(rscontent.getString(2));
    String a=rscontent.getString(2);
    d.PutDatabaseValue(a);
    
    content[count]= rscontent.getString(2);
    // System.out.println( content[count]);
    count++;
}
 
   d.printArray();
   /*
   for(int i=0;i<content.length;i++)
   {
       if(content[i]!=null)
       {
            System.out.println( content[i]);
       }
   }
   */
   
  
   
   
 /*  
   while(rschoice.next())
   {
       int count=0;
    choice[count]= rschoice.getString(count);
    System.out.println( choice[count]);
    count++;
   }
*/
   
   
    connection.close();
  
    }
    
}
