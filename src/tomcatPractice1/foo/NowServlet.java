package tomcatPractice1.foo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NowServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
		HttpServletResponse response) throws
			IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.println(new Date());
	}
}

