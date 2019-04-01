package com.cts.academy1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.academy1.BO.FacultyBO;
import com.cts.academy1.BO.SkillSetBO;
import com.cts.academy1.model.Faculty;
import com.cts.academy1.model.SkillSet;

/**
 * Servlet implementation class FacultyInsertServlet
 */
@WebServlet("/FacultyInsertServlet")
public class FacultyInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String fid=request.getParameter("fid");
		String fname=request.getParameter("fname");
		String qua=request.getParameter("fqua");
		String skid=request.getParameter("fskill");
		char ch=request.getParameter("certified").charAt(0);
		String cer=request.getParameter("certified");
		
		System.out.println(fid+"  *** "+fname+" $$$ "+skid+"  ---- "+ch);
		
		SkillSetBO ss=new SkillSetBO();
		FacultyBO fb=new FacultyBO();
		try {
			ss.insertFaculty(new SkillSet(fid,skid,cer));
			fb.insertFaculty(new Faculty(fid,fname,qua));
			RequestDispatcher rd = request.getRequestDispatcher("home.html");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
