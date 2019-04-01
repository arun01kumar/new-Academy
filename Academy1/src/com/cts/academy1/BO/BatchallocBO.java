package com.cts.academy1.BO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cts.academy1.configure.MyConnection;
import com.cts.academy1.model.Batchalloc;

public class BatchallocBO {
	
	public boolean insertBatch(Batchalloc ba)throws Exception
	{
		boolean b=false;
		Connection c=null;
		try
		{
			c=MyConnection.getConnection();
			PreparedStatement ps=c.prepareStatement("insert into batch values(?,?,?,?,?)");
			
			ps.setString(1,ba.getBatchid());
			ps.setString(2,ba.getFacultyid());
			ps.setString(3,ba.getStdate());
			ps.setString(4,ba.getEndate());
			ps.setString(5,ba.getCldate());
			
			
			boolean b1=ps.execute();
			 System.out.println(b1);
             b=true;
			}
		catch(Exception e)
		{
			 b=false;
             System.out.println(e);
         }
         finally {
            c.close();
         }
         return b;	
		
	}

}
