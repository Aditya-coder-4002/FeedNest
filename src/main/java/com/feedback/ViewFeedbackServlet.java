package com.feedback;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ViewFeedbackServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("adminUser") == null) {
            response.sendRedirect("admin_login.jsp");
            return;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Feedbacks</title>");
        out.println("<style>body{font-family:Arial;} table{border-collapse:collapse;width:80%;margin:20px auto;} "
            + "th,td{border:1px solid #ccc;padding:8px;text-align:left;} th{background:#f4f4f4;} "
            + "a{display:block;margin:20px;text-align:center;}</style></head><body>");
        out.println("<h2 style='text-align:center;'>All Feedbacks</h2>");

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM feedback ORDER BY id DESC");

            out.println("<table><tr><th>ID</th><th>Name</th><th>Email</th><th>Message</th><th>Time</th></tr>");
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("id") + "</td>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getString("email") + "</td>");
                out.println("<td>" + rs.getString("message") + "</td>");
                out.println("<td>" + rs.getTimestamp("created_at") + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<a href='logout'>Logout</a>");
            out.println("</body></html>");

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}
