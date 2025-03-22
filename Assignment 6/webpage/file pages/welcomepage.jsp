<%@ page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession session1 = request.getSession(false);
    String username = (session1 != null) ? (String) session1.getAttribute("username") : null;
    if (username == null) {
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="../assets/css/styles.css">
</head>
<body>
    <h2>Welcome, <%= username %>!</h2>
    <a href="logout.jsp">Logout</a>
</body>
</html>
