package com.cts.academy1.BO;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cts.academy1.model.Faculty;
import com.cts.academy1.model.Login;
import com.cts.academy1.model.Skill;



public class FacultyBO {

       public static Connection getConnection() {
        Properties props = new Properties();
        //FileInputStream fis = null;
        Connection con = null;
        try {
          //  fis = new FileInputStream("src/db.properties");
             
             
             InputStream fis = FacultyBO.class.getClassLoader().getResourceAsStream("/db.properties");
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
       
       
       
       public boolean insertFaculty(Faculty f) throws Exception {
              boolean b=false;
               Connection c=null;
               try {
                   c=getConnection();
                   PreparedStatement ps=c.prepareStatement("insert into faculty values(?,?,?)");
                 
                 
                  ps.setString(1, f.getFaculty_id());
                  ps.setString(2, f.getFaculty_name());
                  ps.setString(3,f.getQualification());
                 
                  
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
       public String getFaultyId() throws Exception {
    	   String fid="";
    	   int big=0;
    	   String s="";
    	   Connection c=null;
           try {
               c=getConnection();
               PreparedStatement ps=c.prepareStatement("select faculty_id from faculty");
               ResultSet rs=ps.executeQuery();
               while(rs.next())
               {
            	   s=rs.getString(1);
            	   String s1=s.substring(1,s.length());
            	   System.out.println(s1);
            	    int i=Integer.parseInt(s1);
            	   
            	   if(big<i) {
            		   big=i;
            	   }
            	   else {
            		   big=big;
            	   }
               }
               big=big+1;
               System.out.println(big);
               
           }
           catch(Exception e) {
              // b=false;
               System.out.println(e);
           }
           finally {
               c.close();
           }
    	   fid=s.substring(0,(s.length()-1));
    	   fid=fid+big;
    	   return fid;
       }
       
       
       
}

