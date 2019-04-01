package com.cts.academy1.BO;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cts.academy1.configure.MyConnection;
import com.cts.academy1.model.Skill;



public class SkillBO {
	
	

	 public List<Skill> getAllSkills() throws Exception{
  	   List<Skill> al=new ArrayList<Skill>();
  	 Connection con=null;
     try {
     con=MyConnection.getConnection();
     Statement s=con.createStatement();
     ResultSet rs=s.executeQuery("select * from skill_m");
     while(rs.next()) {
         al.add(new Skill(rs.getString(1),rs.getString(2),rs.getString(3)));
     }
     }
     catch(Exception e) {System.out.println(e);}
     finally {
         con.close();
     }

  	   
  	   return al;
     }
}
