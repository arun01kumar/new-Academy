package com.cts.academy1.BO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cts.academy1.configure.MyConnection;
import com.cts.academy1.model.SkillSet;


public class SkillSetBO {

	public boolean insertFaculty(SkillSet ss) throws Exception {
        boolean b=false;
         Connection c=null;
         try {
             c=MyConnection.getConnection();
             PreparedStatement ps=c.prepareStatement("insert into skillset values(?,?,?)");
           
           
            ps.setString(1, ss.getFacultyid());
            ps.setString(2, ss.getSkill());
            ps.setString(3,ss.getCertification());
           
            
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
}
