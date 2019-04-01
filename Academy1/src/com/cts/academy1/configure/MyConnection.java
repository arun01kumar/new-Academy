package com.cts.academy1.configure;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;



public class MyConnection {
	public static Connection getConnection() {
        Properties props = new Properties();
        //FileInputStream fis = null;
        Connection con = null;
        try {
          //  fis = new FileInputStream("src/db.properties");
             
             
             InputStream fis = MyConnection.class.getClassLoader().getResourceAsStream("/db.properties");
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

}
