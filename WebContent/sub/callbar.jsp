<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>練習問題</title>
</head>
<body>
<h2>BarServletへのリンク</h2>
<p><a href="../BarServlet">BarServlet</a></p>
<p><a href="<%= request.getContextPath() %>/BarServlet">BarServlet</a></p>
</body>
</html>