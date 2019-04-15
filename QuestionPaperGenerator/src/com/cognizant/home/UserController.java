package com.cognizant.home;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public UserController() {
        super();
     
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    String m_operation=request.getParameter("operation");
    System.out.println(m_operation);
    if(m_operation.equals("update")){
    	RequestDispatcher rd=request.getRequestDispatcher("updateuser.html");
    	rd.forward(request, response);
    }
    else if(m_operation.equals("display")){
    	RequestDispatcher rd=request.getRequestDispatcher("DisplayUserServlet");
    	rd.forward(request, response);
    	
    }
    }

}
