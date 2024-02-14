<%@ page import="java.sql.SQLException" %>
<%@ page import="cred.credentials" %>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
    <link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body>
<% if("post".equalsIgnoreCase(request.getMethod())) {
    int serial_number = Integer.parseInt(request.getParameter("serial_number"));
    String name = request.getParameter("name");
    String gmail = request.getParameter("gmail");
    PrintWriter print = response.getWriter();
    try {
        credentials.insertRecord(serial_number, name, gmail);
        print.println("<p>Registration successful!</p>");
    } catch (ClassNotFoundException | SQLException e) {
        print.println("<p>Error during registration: " + e.getMessage() + "</p>");
        e.printStackTrace();
    }
} %>
<form action="index.jsp" method="post">
    <label>Serial Number:</label>
    <input type="text" name="serial_number"><br><br>
    <label>Name:</label>
    <input type="text" name="name"><br><br>
    <label>Gmail:</label>
    <input type="text" name="gmail"><br><br>
    <input type="submit" value="Login">
</form>
</body>
</html>
