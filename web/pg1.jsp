<%@page import="java.util.Vector"%>
<%@page import="com.servlet.Controller"%>
<%@page import="Cluster.JobExecutor"%>
<%@page import="Cluster.JobExecutor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ON TEST</title>
    </head>
    <body>
        
  
       
       <%--  <%
        if(request.getAttribute("message") != null) {
            out.println("<h1>" + request.getAttribute("message") + "</h1>");
        }
    %>--%>

       <% 
String  s1  = (String) session.getAttribute("var");        
%>
<%= s1 %>
       
   <%--<form method="get" action="sayhello">
     <label for="name">Enter your name</label>
   <input type="text" name="name" id="name" />
   <input type="submit" value="Submit">
    </form>
   --%>
        
        

   
   
  
  <%--      <textarea rows="4" cols="50" name="content" >
At w3schools.com you will learn how to make a website. We offer free tutorials in all web development technologies. 

</textarea>--%>
        
    </body>
</html>
