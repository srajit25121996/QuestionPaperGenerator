package com.cognizant.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.dao.QuestionDao;
import com.cognizant.daoImpl.QuestionDaoImpl;
import com.cognizant.model.Question;
import com.cognizant.service.QuestionPaperService;
import com.cognizant.serviceimpl.QuestionPaperServiceImpl;
public class PaperGeneration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public PaperGeneration() {
        super();
       
    }
/*
    
    void createPage(PrintWriter out,LinkedHashMap<Question,String[]> xList, int count,HttpSession session){
  	    int i=0;
	
	
	//int count1= (Integer)session.getAttribute("count");
	if(count == 10){
		out.println("<html><body>");
		 out.println("<form action='ResultDemo' method='post' >");
		 out.println("<tr><td><input type='submit' value='Finish'></td></tr>");
		 out.println("</form></body></html>");
		
	}
	else	{
	//	 String option="option"+i;
		out.println("<html><body>");
		Set<Question> keys=null;  
		Iterator<Question>itr=null;
		if(count==0){
		   keys=xList.keySet();
		   itr=keys.iterator();
          } 
		  
	      if(itr.hasNext()){
	    	  Question Q= itr.next();
			out.println("<form action='PaperGeneration' method='post' >");
			           //    Question q=    aList.get(count);   
			     out.println("<table>");
			    
			     out.println("<tr><td>Q "+(count+1)+Q.getQuestion()+"</td></tr>" );
			   
			     String choice[]=xList.get(Q);
			   For Question having Radio Button
			  
			   
			   if(Q.getSelection().equals("R"))
	             { 
	              out.println("<td><input type='radio' name='option' value='"+choice[0]+"'>"+choice[0]+"</td></tr>"); 
				  out.println("<td><input type='radio' name='option'  value='"+choice[1]+"' >"+choice[1]+"</td></tr>");
				  out.println("<td><input type='radio' name='option'  value='"+choice[2]+"' >"+choice[2]+"</td></tr>"); 
				  out.println("<td><input type='radio' name='option'  value='"+choice[3]+"'>"+choice[3]+"</td></tr>");
			     }
			 
			  
			  For CheckBox  
			  
			  
			  else if(Q.getSelection().equals("C")){
				  out.println("<td><input type='checkbox' name='option1' value='"+choice[0]+"' >"+choice[0]+"</td></tr>"); 
				  out.println("<td><input type='checkbox' name='option1'  value='"+choice[1]+"' >"+choice[1]+"</td></tr>");
				  out.println("<td><input type='checkbox' name='option1'  value='"+choice[2]+"' >"+choice[2]+"</td></tr>"); 
				  out.println("<td><input type='checkbox' name='option1'  value='"+choice[3]+"'>"+choice[3]+"</td></tr>");	  
			     }
			     count=count+1;
			     session.setAttribute("count", count);
			//     System.out.println("test "+count);
			     out.println("<tr><td><input type='hidden' name='questionid' value='"+Q.getQuestion_id()+"'></td></tr>");
	             out.println("<tr><td><input type='submit' value='Next'></td></tr>");
			     i++;
			     out.println("</form></body></html>");
	      }       
	      }
	
                 }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	   PrintWriter out=response.getWriter();
        HttpSession session = request.getSession();
		   Integer count=(Integer) request.getAttribute("count");
		   session.setAttribute("count", count);
	       QuestionPaperService qService= new QuestionPaperServiceImpl();
	   
		    LinkedHashMap<Question,String[]>aList=( LinkedHashMap<Question,String[]>)session.getAttribute("questions");  
		   if (count==null && aList==null){
        count=0;
      //  System.out.println("in get "+count);
       
         session.setAttribute("question", aList);
		 //  LinkedHashMap<Question, String[]> hMap = null;
		   LinkedHashMap<Question, String[] >qMap=qService.getQuestionPaper("java", "1");	
		   createPage(out,qMap , count, session);
		   }
		   //   createPage(out,qMap, count, session);
		    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     PrintWriter out= response.getWriter();
	     HttpSession session = request.getSession(false);
	   //  System.out.println(session.isNew());
	     Integer count=(Integer)session.getAttribute("count");
	     //System.out.println("after sssion created "+count);
	     LinkedHashMap<Question,String[]>aList=(LinkedHashMap<Question,String[]>)session.getAttribute("question");
	     if(count == null )
{
        count=1;
       // System.out.println("in post 1 "+count);
}
     	 session.setAttribute("count", count);
	   //  System.out.println("in post 2 "+count);
	     String m_qid=request.getParameter("questionid");
	      String  m_option=request.getParameter("option");             
	    String  m_values[]=request.getParameterValues("option1");

	    String res="";
	    if(m_values != null ){
	    	for(String v:m_values){
	    		
	            res+=v+","; 		
	       //     System.out.println("m_values test");
	    	}
	   
	    }
	 	
	     
	     Map<String,String>ansMap=(Map)session.getAttribute("answers");//answers from user
		 if(ansMap ==null)
{
		 ansMap=new HashMap<String, String>(); 
	}
       if(m_values !=null){
       	String m_option1=res.substring(0,(res.length()-1));
       	ansMap.put(m_qid, m_option1);
       }else{
		 ansMap.put(m_qid, m_option);
       }
		 session.setAttribute("answers", ansMap);
		 System.out.println(ansMap);
		 QuestionPaperService qService= new QuestionPaperServiceImpl();
		 LinkedHashMap<Question, String[] >qMap=qService.getQuestionPaper("java", "1");
		 if(aList != null)
		 createPage(out, qMap,  count, session);
	}*/
    
    void createPage(PrintWriter out,ArrayList<Question> aList, int count,HttpSession session){
      	    int i=count;
    	
    	
    	//int count1= (Integer)session.getAttribute("count");
    	if(count == 10){
    		out.println("<html><body>");
			 out.println("<form action='ResultDemo' method='post' >");
			 out.println("<tr><td><input type='submit' value='Finish'></td></tr>");
			 out.println("</form></body></html>");
			
		}
    	else	{
    	//	 String option="option"+i;
    		out.println("<html><body>");
    	  //T1	 Random rand = new Random();
			    
    		//T1      int randomIndex = rand.nextInt(aList.size());
    		//T1   Question randomElement = aList.get(randomIndex);
		        //System.out.println("random "+randomIndex+" "+randomElement);
		        
		
    			out.println("<form action='PaperGeneration' method='post' >");
    			System.out.println(count+" in Create page");
    			System.out.println(aList);               
    			Question q=    aList.get(count);   
    			//T1 Question q=    aList.get(randomIndex);   
    			//T1aList.remove(randomIndex);
    			/* T1 ArrayList<String> givenList = new ArrayList<String>();
    			      		 givenList.add(q.getChoice1());   
    			      		 givenList.add(q.getChoice2());
    			      		 givenList.add(q.getChoice3());
    			      		 givenList.add(q.getChoice4());
    			      		 String choice[]=new String [4];
    			      		 int numberOfElements = 4;
    			      		 Random rand1 = new Random();
    			      		 for (int j = 0; j < numberOfElements; j++) 
    			      		 {
    			      		 int randomIndex1 = rand1.nextInt(givenList.size());
    			      		 String randomElement1 = givenList.get(randomIndex1);
    			      		 choice[j]=randomElement1;
                             givenList.remove(randomIndex1);
    			              }*/     
    			               
    			               
    			     out.println("<table>");
    			     out.println("<tr><td>Q "+(i+1)+q.getQuestion()+"</td></tr>" );
    			   
    			   
    			//   For Question having Radio Button
    			  
    			   
    			   if(q.getSelection().equals("R"))
    	             { 
    	              out.println("<td><input type='radio' name='option' value='"+q.getChoice1()+"'>"+q.getChoice1()+"</td></tr>"); 
    				  out.println("<td><input type='radio' name='option'  value='"+q.getChoice2()+"' >"+q.getChoice2()+"</td></tr>");
    				  out.println("<td><input type='radio' name='option'  value='"+q.getChoice3()+"' >"+q.getChoice3()+"</td></tr>"); 
    				  out.println("<td><input type='radio' name='option'  value='"+q.getChoice4()+"'>"+q.getChoice4()+"</td></tr>");
    			     }
    			 
    			  
    			 // For CheckBox  
    			  
    			  
    			  else if(q.getSelection().equals("C")){
    				  out.println("<td><input type='checkbox' name='option1' value='"+q.getChoice1()+"' >"+q.getChoice1()+"</td></tr>"); 
    				  out.println("<td><input type='checkbox' name='option1'  value='"+q.getChoice2()+"' >"+q.getChoice2()+"</td></tr>");
    				  out.println("<td><input type='checkbox' name='option1'  value='"+q.getChoice3()+"' >"+q.getChoice3()+"</td></tr>"); 
    				  out.println("<td><input type='checkbox' name='option1'  value='"+q.getChoice4()+"'>"+q.getChoice4()+"</td></tr>");	  
    			     }
    			     count=count+1;
    			     session.setAttribute("count", count);
    			//     System.out.println("test "+count);
    			     out.println("<tr><td><input type='hidden' name='questionid' value='"+q.getQuestion_id()+"'></td></tr>");
    			     if(count>1 && count<=10){
    			    	 out.println("<tr><td><input type='submit' name='button' value='Prev'></td></tr>");
    			     }
    	             
    	             out.println("<tr><td><input type='submit' name='button' value='Next'></td></tr>");
    			     
    			     out.println("</form></body></html>");
                     }
                     }


   
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      	   PrintWriter out=response.getWriter();
	      	   
	      	   
	           HttpSession session = request.getSession();
			   Integer count=(Integer) request.getAttribute("count");
			   
			   
             
               session.setAttribute("count", count);
			   QuestionPaperService qService= new QuestionPaperServiceImpl();
		    	
			   //       QuestionDao qDao= new QuestionDaoImpl();
			   ArrayList<Question>aList=(ArrayList<Question>)session.getAttribute("questions");  
			   if (count==null && aList==null){
	           count=0;
	         //  System.out.println("in get "+count);
	           aList=qService.getQuestionPaper1("java","1");
	        	int x=1; 
	           for(Question Q:aList ){
	        		 System.out.println(x+" "+Q.getQuestion());
	        	  x++; 
	           }
	           
	           
			   }
	           session.setAttribute("question", aList);
			   createPage(out,aList, count, session);
			    }

void getPrevious(PrintWriter out,int count,ArrayList<Question>aList,HttpSession session){
	
	count--;
	session.setAttribute("count", count);
	createPage(out, aList,  count, session);
	
	System.out.println(count);
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     PrintWriter out= response.getWriter();
		     HttpSession session = request.getSession(false);
		   //  System.out.println(session.isNew());
		     Integer count=(Integer)session.getAttribute("count");
		     System.out.println("after sssion created "+count);
		     String m_prevbutton=request.getParameter("button");
		     System.out.println(m_prevbutton);
				    
		     ArrayList<Question>aList=(ArrayList<Question>)session.getAttribute("question");
		     if(m_prevbutton.equals("Prev") && count>0){
                    count--;
		    	    getPrevious(out,count,aList,session);
   	   }
		     else {//for next
	
		   /*  if(count == null )
	{
	         count=1;
	         System.out.println("in post 1 "+count);
    }*/
	      	 session.setAttribute("count", count);
		   //  System.out.println("in post 2 "+count);
		     String m_qid=request.getParameter("questionid");
		      String  m_option=request.getParameter("option");             
		    String  m_values[]=request.getParameterValues("option1");

		    String res="";
		    if(m_values != null ){
		    	for(String v:m_values){
		    		
		            res+=v+","; 		
		       //     System.out.println("m_values test");
		    	}
		   
		    }
		 	
		     
		     Map<String,String>ansMap=(Map)session.getAttribute("answers");//answers from user
			 if(ansMap ==null)
	{
			 ansMap=new HashMap<String, String>(); 
    	}
	        if(m_values !=null){
	        	String m_option1=res.substring(0,(res.length()-1));
	        	ansMap.put(m_qid, m_option1);
	        }else{
			 ansMap.put(m_qid, m_option);
	        }
			 session.setAttribute("answers", ansMap);
			 System.out.println(ansMap);
			 if(aList != null)
			 createPage(out, aList,  count, session);
		}
	}//for next
}
