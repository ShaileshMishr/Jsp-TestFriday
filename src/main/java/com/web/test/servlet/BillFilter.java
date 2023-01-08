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

import com.web.test.dao.ConsumerDao;
import com.web.test.dao.ConsumerDaoImpl;
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
		
		int meterId = Integer.parseInt(request.getParameter("meterId"));
		
		ConsumerService service = new ConsumerServiceImpl();
		 
			if(service.isValidId(meterId)) {
				ConsumerDao dao = new ConsumerDaoImpl();
				List<Electric> eleList = dao.getData();
				for(Electric ele:eleList) {
					if(ele.getMeterId()==meterId) {
						request.setAttribute("meterId", meterId);
						request.setAttribute("currRead", ele.getCurrentMeterRd());
						request.setAttribute("prevRead", ele.getPreviousMeterRd());
						request.setAttribute("zone", ele.getZone());
						
						chain.doFilter(request, response);

						
					}
					
				}

	}
		else {
			//out.print("<h2>** Meter Id does not exist**</h2> ");
			
			RequestDispatcher rd = request.getRequestDispatcher("new.jsp");
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
