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


import com.cts.academy1.model.Module1;


public class ModuleBO {
	
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
	public boolean insertModule(Module1 m)throws Exception
	{
		boolean b=false;
        Connection c=null;
        try {
            c=getConnection();
            PreparedStatement ps=c.prepareStatement("insert into skill_m values(?,?,?)");
          
          
           ps.setString(1, m.getSkillid());
           ps.setString(2, m.getSkillname());
           ps.setString(3, m.getCertification());
          
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
	
	
	public List<Module1> getAllModules() throws Exception{
		List<Module1> ar=new ArrayList<Module1>();
		
		Connection con=null;
        try {
        con=getConnection();
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from skill_m");
        while(rs.next()) {
            ar.add(new Module1(rs.getString(1),rs.getString(2),rs.getString(3)));
        }
        }
        catch(Exception e) {System.out.println(e);}
        finally {
            con.close();
        }

		
		return ar;
	}

}
