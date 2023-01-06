package com.web.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.test.model.Electric;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		
		List<Electric> elcList = (List<Electric>)request.getAttribute("elecList");
		
		out.print("<a href='product.html' class='link'><button type=\"button\">ADD PRODUCT</button></a>");
		out.print("<a href='delete.html' class='link'><button type=\"button\">DELETE PRODUCT</button></a>");
		out.print("<a href='update.html'><button type=\"button\">UPDATE PRODUCT</button></a><br><br>");
		out.println("</div>");

	
		    out.println("<br><br><br><table border='5' class='center' > ");
			out.println("<tr> <th>");
			out.println("Meter ID </th>");
			out.println("<th> Current Meter Reading </th>");
			out.println("<th>Previous Meter Reading </th>");
			out.println("<th>Zone </th>");

			
			for(Electric elc:elcList) {
				out.println("<tr><td>" +elc.getMeterId() +"</td>");
				out.println("<td>" +elc.getCurrentMeterRd() +"</td> ");
				out.println("<td>" +elc.getPreviousMeterRd() +"</td> ");
				out.println("<td>" +elc.getZone() +"</td> </tr>");
			}
			
			RequestDispatcher rd = request.getRequestDispatcher("welcome2.jsp");
			rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
