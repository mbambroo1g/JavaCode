<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Date d1 = new Date();
	//public void _jspInit(){}
%>

<h1>This is my first jsp</h1>
<%
	//java code
	Date d = new Date();
	out.print("Today's date is: "+d+"<br/>");
	out.print("Date grom declaration is: "+d1);
%>
</body>
</html>