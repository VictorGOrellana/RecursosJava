package curso.edu.filter;

import java.io.IOException;

import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import curso.edu.entidade.user;

@WebFilter(urlPatterns = { "/pages/*" })

public class FilterAutenticacao implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// executa as a��es do request e response
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		String urlParaAut = req.getServletPath();
		
		user uL = (user) session.getAttribute("usuario");
		
		if(uL == null && !urlParaAut.equalsIgnoreCase("/pages/ServletAutenticacao")) {
		
			RequestDispatcher reqDis = request.getRequestDispatcher("/autenticar.jsp?url="+urlParaAut);
			reqDis.forward(request, response);
			return;
		}
		
		chain.doFilter(request, response);

		System.out.println("interceptando");
	}

}
