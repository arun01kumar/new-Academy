<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.cts.academy1.BO.*,com.cts.academy1.model.*,java.util.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
</head>
<body>
<div id="container">
			<header>ACADEMY PORTAL</header>

<%
FacultyBO fb=new FacultyBO();
String s=fb.getFaultyId();
List<Skill> skl=new ArrayList<Skill>();
SkillBO sb=new SkillBO();
skl=sb.getAllSkills();

%>


<form action="./FacultyInsertServlet" method="post">
<table cellpadding="12" align="center"style="border:2px solid black;">
					<caption style="color:black"><h2>New Faculty Entry</h2></caption>
					<div>
					<tr>
						<th> Faculty id : </th>
						<td><input type="text" size="25" placeholder="asdfgh" name="fid" value="<%=s %>"></td>
					</tr>
					<tr>
						<th> Faculty name : </th>
						<td><input type="text" size="25" placeholder="asdfgh" name="fname"></td>
					</tr>
					<tr>
						<th> Qualification : </th>
						<td><input type="text" size="25" placeholder="asdfgh" name="fqua"></td>
					</tr>
                    <tr>
                      <th> Skill :</th>
                      <td><select name="fskill">
                    <% for(Skill s1:skl){ %>
 					<option value="<%=s1.getSkillid()%>"><%=s1.getSkill() %></option>
  					<%} %>
					 </select></td></tr><br>
					 <tr>
    <th> Certification :</th>
    <td><input type="radio" name="certified" value="Y" checked> Yes
    <input type="radio" name="certified" value="N"> No </td>
  </tr>
  <tr>
						<th colspan="2">
						<input type="submit" value="Submit" id="submit" >
						<hr color="red" size="2">
						Home <a href="index.html"> click here </a>
						</th>
					</tr>


</form>
</div>
</body>
</html>