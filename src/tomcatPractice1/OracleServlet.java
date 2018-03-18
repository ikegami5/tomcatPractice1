package tomcatPractice1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OracleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
		HttpServletResponse response) throws
			IOException, ServletException {
		Oracle ora = new Oracle();
		String result = ora.getResult();

		PrintWriter out = response.getWriter();
		out.println("your fortune is " + result);
	}
}
