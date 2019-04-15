<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<%
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

%>

<%=q1 %><%=option1 %>
<%=q2 %><%=option2 %>
<%=q3 %><%=option3 %>
<%=q4 %><%=option4 %>
<%=q5 %><%=option5 %>
<%=q6 %><%=option6 %>
<%=q7 %><%=option7 %>
<%=q8 %><%=option8 %>
<%=q9 %><%=option9 %>
<%=q10 %><%=option10 %>

</body>
</html>