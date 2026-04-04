<%@page import="com.mainapp.*"%>

<%
	ArithmeticOperations ao=new ArithmeticOperations();
	int result=ao.sum(101, 102);
%>
<h1> From Module3:: sum =<%=result%></h1>