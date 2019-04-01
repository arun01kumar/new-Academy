package com.cts.academy1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.academy1.BO.FacultyBO;
import com.cts.academy1.BO.LoginBO;
import com.cts.academy1.model.Faculty;
import com.cts.academy1.model.Login;

/**
 * Servlet implementation class FacultyServlet
 */
@WebServlet("/FacultyServlet")
public class FacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyServlet() {
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
		
		
		int Faculty_id=Integer.parseInt(request.getParameter("fid"));
		
		String fid=request.getParameter("fid");
	        String Faculty_name=request.getParameter("fname");
	        
	        String qualification=request.getParameter("fqua");
	       
	        
	        Faculty f=new Faculty(fid,Faculty_name,qualification);
	        
	        FacultyBO fb=new FacultyBO();
	        boolean b=true;
	        
	        try {
	               b=fb.insertFaculty(f);
	               System.out.println("Value inserted");
	        } catch (Exception e) {
	               // TODO Auto-generated catch block
	               b=false;
	               e.printStackTrace();
	        }
	        
	}

}
