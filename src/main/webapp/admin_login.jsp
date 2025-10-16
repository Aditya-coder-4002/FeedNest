<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>Admin Login</title>
<style>
body { font-family: Arial; background: #e9ecef; }
form { background: white; width: 320px; margin: 100px auto; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px gray; }
input { width: 100%; padding: 8px; margin: 10px 0; border-radius: 4px; border: 1px solid #ccc; }
input[type=submit] { background: #007bff; color: white; cursor: pointer; }
.error { color: red; text-align: center; }
</style>
</head>
<body>
<form action="adminLogin" method="post">
    <h2>Admin Login</h2>
    <input type="text" name="username" placeholder="Username" required>
    <input type="password" name="password" placeholder="Password" required>
    <input type="submit" value="Login">
    <% String err = (String) request.getAttribute("error");
       if (err != null) { %>
       <p class="error"><%= err %></p>
    <% } %>
</form>
</body>
</html>
