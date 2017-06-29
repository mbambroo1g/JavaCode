<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="MultiplicationForm.html" %>
	
<%try{
int val =Integer.parseInt(request.getParameter("val"));
for(int i = 1;i<=10;i++){
 %>
<table border ="3">
	<tr><td>
		<%=val %> X <%=i  %> = <%=val*i %> <br/> <!-- Expression, the line of code which does not need compilation. -->
	</td></tr>
<%
	}
}
catch(NumberFormatException nfe){
	out.print("Invalid Entry. Please use a number.");
}
%>
</table>
</body>
</html>