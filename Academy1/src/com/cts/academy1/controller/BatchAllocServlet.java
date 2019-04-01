package com.cts.academy1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.academy1.BO.BatchallocBO;
import com.cts.academy1.BO.FacultyBO;
import com.cts.academy1.BO.SkillSetBO;
import com.cts.academy1.model.Batchalloc;
import com.cts.academy1.model.Faculty;
import com.cts.academy1.model.SkillSet;

/**
 * Servlet implementation class BatchAllocServlet
 */
@WebServlet("/BatchAllocServlet")
public class BatchAllocServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchAllocServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String bid=request.getParameter("bid");
		String fid=request.getParameter("fid");
		String sdate=request.getParameter("sdate");
		String edate=request.getParameter("edate");
		String cdate=request.getParameter("cdate");
		
		//System.out.println(fid+"  *** "+fname+" $$$ "+skid+"  ---- "+ch);
	    Batchalloc ba=new Batchalloc(bid,fid,sdate,edate,cdate);	
		BatchallocBO bb=new BatchallocBO();
	
		 boolean b=true;
	        
	        try {
	               b=bb.insertBatch(ba);
	               System.out.println("Value inserted");
	        } catch (Exception e) {
	               // TODO Auto-generated catch block
	               b=false;
	               e.printStackTrace();
	        }
		
		
		
	}

}
