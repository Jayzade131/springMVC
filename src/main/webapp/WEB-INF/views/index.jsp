<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> frds = (List<String>) request.getAttribute("frds");
	%>

	<h2>
		name :
		<%=name%>
	</h2>
	<h2>
		id :
		<%=id%>
	</h2>
	<h2>
		friends :
		<%
	for (String s : frds) {
		out.println(s);
	}
	%>
	</h2>
</body>
</html>