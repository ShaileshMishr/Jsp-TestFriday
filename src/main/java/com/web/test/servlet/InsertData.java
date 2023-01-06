package com.web.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 try {
			 
			 Connection con = DatabaseConnection.initializeDatabase();
	  
	             PreparedStatement st = con
	                   .prepareStatement("insert into electric values(?, ?,?,?)");
	  
	           
	            st.setInt(1, Integer.valueOf(request.getParameter("id")));
	            st.setString(2,request.getParameter("cur"));
	            st.setString(3, request.getParameter("pre"));
	            st.setString(4, request.getParameter("zone"));
	            
	            st.executeUpdate();
	  
	           
	            st.close();
	            con.close();
	  
	           
	            PrintWriter out = response.getWriter();
	            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
	}
	
    catch (Exception e) {
        e.printStackTrace();
    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
