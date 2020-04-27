package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	//When interservlet communication is done by RequestDispatcher
	/*int k=(int)req.getAttribute("k");// here we are fetching the k value
									//since addServlet sended the k as an object 
									//so by type casting we can convert it in the integer format
									
	k=k*k;;
	PrintWriter out=resp.getWriter();
	out.print("Square of result is: "+k);
	*/
	
	//When interservlet communication is done by sendRedirect
	/*int k=Integer.parseInt(req.getParameter("k"));
	k=k*k;
	PrintWriter out=resp.getWriter();
	out.print("Square of result is: "+k);
	*/
	
	HttpSession session=req.getSession();
	int k=(int)session.getAttribute("k");
	k=k*k;
	PrintWriter out=resp.getWriter();
	out.print("Square of result is: "+k);
	
}
}
