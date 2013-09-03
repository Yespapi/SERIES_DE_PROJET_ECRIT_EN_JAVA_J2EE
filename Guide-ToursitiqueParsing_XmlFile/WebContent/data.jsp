<%@ page import="java.sql.*" %><%@ page import="java.io.*" %><%@ page import="com.mysql.*" %><?xml version="1.0"?>
<tours>
<%
	Connection connection = null;
	Statement statement = null;
	ResultSet result = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tours", "root", "root");
		statement = connection.createStatement();
		String s = "Select * from tour";
		result = statement.executeQuery(s);
		while(result.next()) {
			%>
			<tour>
				<tourId><% out.print(result.getString("tourID")); %></tourId>
				<tourTitle><% out.print(result.getString("tourTitle")); %></tourTitle>
				<packageId><% out.print(result.getString("packageId")); %></packageId>
				<packageTitle><% out.print(result.getString("packageTitle")); %></packageTitle>
				<description><% out.print(result.getString("description")); %></description>
				<price><% out.print(result.getString("price")); %></price>
				<difficulty><% out.print(result.getString("difficulty")); %></difficulty>
				<length><% out.print(result.getString("length")); %></length>
				<image><% out.print(result.getString("image")); %></image>
				<link><% out.print(result.getString("link")); %></link>
			</tour>
			<%
		}
	}
	catch(SQLException e) {
		out.println("error connecting to database");
	}
%>
</tours>