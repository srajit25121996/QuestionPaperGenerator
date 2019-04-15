package com.cognizant.registration;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.regex.Pattern;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.service.RegistrationService;
import com.cognizant.serviceimpl.RegistrationServiceImpl;


public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Registration() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter br=response.getWriter();
		String First_Name=request.getParameter("First_Name");
		String Last_Name=request.getParameter("Last_Name");
		String Email=request.getParameter("Email");
		String User_Id=request.getParameter("User_Id");
		String Password=request.getParameter("Password");
		String Emp_Type=request.getParameter("Emp_Type");
		
		
		
		/*Logic for Email validation registration*/ 
		        String em="";
		        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z-]+\\.)+[a-z" +"A-Z]{2,7}$"; 
		                              
		        Pattern pat = Pattern.compile(emailRegex); 
		        if ((Email == null ||  pat.matcher(Email).matches()==false || Email.length()>50) && ((Emp_Type!="A") ||( Emp_Type!="U")  ||  (Emp_Type!="a") || (Emp_Type!="u") )) 
		        response.sendRedirect("USERS.html");
		        else if(pat.matcher(Email).matches()==true )
		        {
		        	
		        	HttpSession session=request.getSession();
		        	session.setAttribute("userid", User_Id);
		                em=Email;
		                RegistrationService rservice=new RegistrationServiceImpl() ;
		                com.cognizant.model.Registration rModel=new com.cognizant.model.Registration(First_Name,Last_Name,em,User_Id,Password,Emp_Type);
		                if(rservice.insertUser(rModel)){
                                        response.sendRedirect("login.html");
		                                                                         }
		
		
		                else{
		                	
		                	/* PrintWriter out=response.getWriter();
		                	 out.println("<html><Body>");
		                	 out.println("<h1>Please enter the valid details</h1>");
		                	 out.println("</Body></html>");*/
		                	
			                           response.sendRedirect("USERS.html");
		                         }
		
			}
       }
}
