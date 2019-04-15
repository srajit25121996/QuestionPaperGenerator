package com.cognizant.result;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.QuestionDao;
import com.cognizant.daoImpl.QuestionDaoImpl;

public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String q1=request.getParameter("q1");
		String q2=request.getParameter("q2");
		String q3=request.getParameter("q3");
		String q4=request.getParameter("q4");
		String q5=request.getParameter("q5");
		String q6=request.getParameter("q6");
		String q7=request.getParameter("q7");
		String q8=request.getParameter("q8");
		String q9=request.getParameter("q9");
		String q10=request.getParameter("q10");


		String option1=request.getParameter("option1");
		String option2=request.getParameter("option2");
		String option3=request.getParameter("option3");
		String option4=request.getParameter("option4");
		String option5=request.getParameter("option5");
		String option6=request.getParameter("option6");
		String option7=request.getParameter("option7");
		String option8=request.getParameter("option8");
		String option9=request.getParameter("option9");
		String option10=request.getParameter("option10");
		
		HashMap<String,String> rmap=new HashMap<String,String>();
		
			rmap.put(q1,option1);
			rmap.put(q2,option2);
			rmap.put(q3,option3);
			rmap.put(q4,option4);
			rmap.put(q5,option5);
			rmap.put(q6,option6);
			rmap.put(q7,option7);
			rmap.put(q8,option8);
			rmap.put(q9,option9);
			rmap.put(q10,option10);
			System.out.println(rmap);
			QuestionDao qdao=new QuestionDaoImpl();
			int total=qdao.getScore(rmap);
			PrintWriter out=response.getWriter();
			out.println(total);
		
		
	}

}