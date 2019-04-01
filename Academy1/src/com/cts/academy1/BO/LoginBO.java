package com.cts.academy1.BO;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.cts.academy1.model.Login;



public class LoginBO {

       public static Connection getConnection() {
        Properties props = new Properties();
        //FileInputStream fis = null;
        Connection con = null;
        try {
          //  fis = new FileInputStream("src/db.properties");
             
             
             InputStream fis = LoginBO.class.getClassLoader().getResourceAsStream("/db.properties");
            props.load(fis);
            
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));

   
            con = DriverManager.getConnection(props.getProperty("DB_URL"),
                      props.getProperty("DB_USERNAME"),
                      props.getProperty("DB_PASSWORD"));
   //   } catch (IOException | ClassNotFoundException | SQLException e) {
        }catch(Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
   }
       
       
       
       public boolean insertUser(Login l) throws Exception {
              boolean b=false;
               Connection c=null;
               try {
                   c=getConnection();
                   PreparedStatement ps=c.prepareStatement("insert into login values(?,?,?,?,?,?,?,?)");
                 
                 
                  ps.setString(1, l.getFname());
                  ps.setString(2, l.getLname());
                  ps.setInt(3, l.getAge());
                  ps.setString(4,l.getGender());
                  ps.setString(5, l.getContnum());
                  ps.setString(6, l.getEid());
                  ps.setString(7, l.getPassword());
                  ps.setString(8, l.getAssid());
                  
                   boolean b1=ps.execute();
                   System.out.println(b1);
                   b=true;
               }
               catch(Exception e) {
                   b=false;
                   System.out.println(e);
               }
               finally {
                   c.close();
               }
               return b;
       }
       
       public boolean checkUser(String assid,String password) throws Exception {
    	   boolean b=false;
    	   String st=null;
    	   
    	   Connection c=null;
           try {
               c=getConnection();
               PreparedStatement ps=c.prepareStatement("select assid,password from login where assid=? and password=? ");
               ps.setString(1, assid);
               ps.setString(2, password);
              // b=ps.execute();
               ResultSet rs=ps.executeQuery();
               
               while(rs.next()) {
            	   if(rs.getString(1).equals(assid)) {
            		   if(rs.getString(2).equals(password)){
            			   b=true;
            			   st="User Name and Password are Correct";
            			   break;
            		   }
            		   else {
            			  // System.out.println("Password error");
            			   st="Error in password";
            			   
            		   }
            	   }
            	   else {
            		   System.out.println("Associate Not found");
            		   st="Error in User Name***";
            	   }
               }
               
               System.out.println(b+"   "+st);
           }
           catch(Exception e) {
        	   System.out.println("Error"+e);
        	   
           }
           finally {
        	   c.close();
           }
    	   
    	   
    	   
    	   
    	   return b;
       }
       
       
       
}





