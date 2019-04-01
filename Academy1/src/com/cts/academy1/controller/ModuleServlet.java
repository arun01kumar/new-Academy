package com.cts.academy1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.academy1.BO.ModuleBO;
import com.cts.academy1.model.Module1;

/**
 * Servlet implementation class ModuleServlet
 */
@WebServlet("/ModuleServlet")
public class ModuleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModuleServlet() {
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
		//doGet(request, response);
		String Skill_id=request.getParameter("skillid");
		String Skill_name=request.getParameter("skillname");
        
        String certification=request.getParameter("certification");
       
        
        Module1 m=new Module1(Skill_id,Skill_name,certification);
        
        ModuleBO mb=new ModuleBO();
        boolean b=true;
        
        try {
               b=mb.insertModule(m);
               System.out.println("Value inserted");
               if(b)
               {
            	   RequestDispatcher rd = request.getRequestDispatcher("home.html");
       			rd.forward(request, response);
               }
               else
               {
            	   RequestDispatcher rd = request.getRequestDispatcher("module.html");
       			rd.forward(request, response);
               }
            
        } catch (Exception e) {
               // TODO Auto-generated catch block
               b=false;
               e.printStackTrace();
        }
	}

}
