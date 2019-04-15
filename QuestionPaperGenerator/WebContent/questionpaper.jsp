<%@page import="com.cognizant.model.Question"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.cognizant.daoImpl.QuestionDaoImpl"%>
<%@page import="com.cognizant.dao.QuestionDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ResultDemo"  method="post">
<table>
<%
    String m_skillSet=request.getParameter("skillset");
String m_competencylevel=request.getParameter("competencylevel");

    QuestionDao qDao= new QuestionDaoImpl();
    m_skillSet="java";
    m_competencylevel="1";
     ArrayList<Question>qList=qDao.getQuestions(m_skillSet,m_competencylevel); 
     int i=1;
     for(Question q:qList){
    	 String option="option"+i;
    	 %>
    	 
      <tr><td><%=i %></td>   
      
          <td><%=q.getQuestion() %></td>
           
          <%
             if(q.getSelection().equals("R"))
             { 
            %>
           <td><input type="radio" name="<%=option %>" value="<%=q.getChoice1() %>"><%=q.getChoice1() %></td> 
           <td><input type="radio" name="<%=option %>" value="<%=q.getChoice2() %>"><%=q.getChoice2() %></td> 
           <td><input type="radio" name="<%=option %>" value="<%=q.getChoice3() %>"><%=q.getChoice3() %></td> 
           <td><input type="radio" name="<%=option %>" value="<%=q.getChoice4() %>"><%=q.getChoice4() %></td> 
            <%}else if(q.getSelection().equals("C")){
            	  
            	%>
            <td><input type="checkbox" name="<%=option %>" value="<%=q.getChoice1() %>"><%=q.getChoice1() %></td>
            <td><input type="checkbox" name="<%=option %>" value="<%=q.getChoice2() %>"><%=q.getChoice2() %></td>
            <td><input type="checkbox" name="<%=option %>" value="<%=q.getChoice3() %>"><%=q.getChoice3() %></td>
            <td><input type="checkbox" name="<%=option %>" value="<%=q.getChoice4() %>"><%=q.getChoice4() %></td>
            <%} %>
      </tr>
       <tr><td><input type="hidden" name="<%=q.getQuestion_id() %>" value="<%=q.getQuestion_id() %>"></td></tr>


<%
   i++; } 
     %>

</table>
<input type="submit" value="submit">
</form>
</body>
</html>