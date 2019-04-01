package com.cts.academy1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.academy1.BO.LoginBO;
import com.cts.academy1.model.Login;


/**
 * Servlet implementation class servlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterServlet() {
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
		
        
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        int age=Integer.parseInt(request.getParameter("age"));
        String gender=request.getParameter("gender");
        String contact=request.getParameter("contnum");
        String email=request.getParameter("email");
        String password=request.getParameter("pw");
        String assid=request.getParameter("aid");
        Login l=new Login(fname,lname,age,gender,contact,email,password,assid);
        LoginBO lb=new LoginBO();
        boolean b=true;
        
        try {
               b=lb.insertUser(l);
               System.out.println("Value inserted");
               if(b)
               {
            	   RequestDispatcher rd = request.getRequestDispatcher("index.html");
       			rd.forward(request, response);
               }
        } catch (Exception e) {
               // TODO Auto-generated catch block
               b=false;
               e.printStackTrace();
        }
        

	}

}
