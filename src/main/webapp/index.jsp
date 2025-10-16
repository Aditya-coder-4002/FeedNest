<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>Feedback Form</title>
<style>
body { font-family: Arial; background: #f9f9f9; }
form { width: 350px; margin: 100px auto; padding: 20px; background: white; box-shadow: 0 0 8px gray; border-radius: 8px; }
input, textarea { width: 100%; margin: 8px 0; padding: 8px; border: 1px solid #ccc; border-radius: 4px; }
input[type=submit] { background: #28a745; color: white; cursor: pointer; }
</style>
</head>
<body>
<form action="feedback" method="post">
    <h2>Feedback Form</h2>
    <input type="text" name="name" placeholder="Your Name" required>
    <input type="email" name="email" placeholder="Your Email" required>
    <textarea name="message" placeholder="Your Message" rows="4" required></textarea>
    <input type="submit" value="Submit Feedback">
    <p><a href="admin_login.jsp">Admin Login</a></p>
</form>
</body>
</html>
