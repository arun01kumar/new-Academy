<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

body{
				background-image: url("107.jpg");
				background-attachment: fixed;
			}
			#container{
				height:90%;
				width:100%;
				margin:5px;
				opacity: 0.7;
				filter: alpha(opacity=70);
				float:right;
			}
			header {
				background-color: #666;
				padding: 30px;
				text-align: center;
				font-size: 35px;
				color: white;
			}
</style>


<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>

</head>
<body>
<header>ACADEMY PORTAL</header>




<%
    try{
    	Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/academy","root","root");

       Statement statement = connection.createStatement() ;

       resultset =statement.executeQuery("select batch_id from batch") ;
%>
<center>
<form action="closeupdate" method="post">

    <h2><i>Batch update</i> </h2>
    Batch Id: 
        <select name="id1">
        <%  while(resultset.next()){ %>
        <option value=<%= resultset.getString(1)%>><%= resultset.getString(1)%></option>
        <% } %>
        </select><br><br>
Enter the updated close date <input type="text" name="closedate" placeholder="update...." align="right" id="datepicker"><br><br><br><br><br><br><br><br><br><br><br>
<input type="submit" value="submit">

<a href="home.html"><button>HOME</button></a>
</form>
</center>
<%
//**Should I input the codes here?**
        }
        catch(Exception e)
        {
             out.println("wrong entry"+e);
        }
%>

</body>
</html>