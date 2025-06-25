
package servlets;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cname = request.getParameter("cname");
        String email = request.getParameter("email");
        String policy = request.getParameter("policy");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance", "root", "password");
            PreparedStatement ps = con.prepareStatement("INSERT INTO companies(name, email, policy) VALUES (?, ?, ?)");
            ps.setString(1, cname);
            ps.setString(2, email);
            ps.setString(3, policy);
            ps.executeUpdate();
            response.sendRedirect("dashboard.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
