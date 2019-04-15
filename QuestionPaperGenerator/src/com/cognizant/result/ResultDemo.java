package com.cognizant.result;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.dao.QuestionDao;
import com.cognizant.daoImpl.QuestionDaoImpl;

public class ResultDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ResultDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		Map<String,String> aMap=(HashMap<String, String>)session.getAttribute("answers");
		System.out.println(aMap);
		QuestionDao qdao=new QuestionDaoImpl();
			int total=qdao.getScore(aMap);
			PrintWriter out=response.getWriter();
			out.println(total);
			session.invalidate();
	}

}
