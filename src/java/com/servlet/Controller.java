/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import Cluster.JobExecutor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {


 /*   protected void showdata(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
    {
        RequestDispatcher dispatcher = request.getRequestDispatcher("pg1.jsp");
dispatcher.forward( request, response ); 
    String message = "Some text here";
System.out.println(message);
request.setAttribute("message",message);
    }*/
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // response.setContentType("text/html;charset=UTF-8");
        
            
          //  if(request.getParameter("name") != null && request.getParameter("name") != "") {
          
       // }else {
            
        //}
        JobExecutor e=new JobExecutor();
        String x="null";
        try {
            x = JobExecutor.main();
        } catch (InterruptedException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getSession().setAttribute("var", x);
        request.getRequestDispatcher("pg1.jsp").forward(request, response); 

      //  getServletContext().getRequestDispatcher("/pg1.jsp").forward(request, response);
      //request.setAttribute("message", "Hello " );        
      //request.setAttribute("message", "");
  // RequestDispatcher dispatcher = request.getRequestDispatcher("pg1.jsp");
//dispatcher.forward( request, response ); 
  //  String message = "Some text here";
//System.out.println(message);
//request.setAttribute("message",message);
            
        //    String message = "Example source code of Servlet to JSP communication.";
	//	request.setAttribute("message", message);

		//communicating a Vector object
	//	Vector vecObj = new Vector();
	//	vecObj.add("Servlet to JSP communicating an object");
	//	request.setAttribute("vecBean",vecObj);

		//Servlet JSP communication
	//	RequestDispatcher reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/jsp/javaPapers.jsp");
	//	reqDispatcher.forward(request,response);
         
                
                /*<jsp:useBean id="testt" class="Controller" />
                           <%
	String message = (String) request.getAttribute("message");
	out.println("Servlet communicated message to JSP: "+ message);

	Vector vecObj = (Vector) request.getAttribute("vecBean");
	out.println("Servlet to JSP communication of an object: "+vecObj.get(0));
%>
                */
                
        }
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    

}
