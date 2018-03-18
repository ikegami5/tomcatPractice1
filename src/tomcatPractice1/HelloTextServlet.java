package tomcatPractice1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloTextServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,
		HttpServletResponse response) throws
			IOException, ServletException {
		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("おはよう");
		out.println("こんにちは");
		out.println("こんばんは");
	}
}