package tomcatPractice1.foo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OmojanServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String html =
			"<html>" +
				"<head>" +
					"<title>AI面雀</title>" +
				"</head>" +
				"<body>" +
					"<h2>" + new Omojan().getWord() + "</h2>" +
				"</body>" +
			"</html>";
		out.println(html);
	}
}

