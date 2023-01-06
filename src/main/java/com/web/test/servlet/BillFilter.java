package com.web.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import com.web.test.model.Electric;
import com.web.test.service.ConsumerService;
import com.web.test.service.ConsumerServiceImpl;



/**
 * Servlet Filter implementation class BillFilter
 */
@WebFilter("/BillFilter")
public class BillFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public BillFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int meterid = Integer.parseInt(request.getParameter("id"));
		
		ConsumerService service = new ConsumerServiceImpl();
		
			if(service.isValidId(meterid)) {
			
				
			
			List<Electric> elecList = service.getData();
			
		request.setAttribute("elecList", elecList);
			chain.doFilter(request, response);
	}
		else {
			out.print("<h2>** Incorrect Meter Id **</h2> ");
			
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
