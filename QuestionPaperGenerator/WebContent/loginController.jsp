<%@page import="com.cognizant.daoImpl.LoginDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cognizant.dao.LoginDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String m_email=request.getParameter("email");
String m_password=request.getParameter("password");
String m_emptype=request.getParameter("emptype");
System.out.println(m_emptype);
LoginDao ldao=new LoginDaoImpl();
if(ldao.validateLogin(m_email, m_password, m_emptype) && (m_emptype.equalsIgnoreCase("A") || m_emptype.equalsIgnoreCase("a") ))
{
	
	response.sendRedirect("AdminDashboard.html");
}
else if(  ldao.validateLogin(m_email, m_password, m_emptype) && (m_emptype.equalsIgnoreCase("U") || m_emptype.equalsIgnoreCase("u") )  ){
	response.sendRedirect("dashboard.html");
}
else{%>


<script type="text/javascript">

alert("Form has been submitted");

</script>

<% 	
response.sendRedirect("login.html");
}


%>

</body>
</html>