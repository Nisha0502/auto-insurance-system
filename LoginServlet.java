
package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if("admin".equals(username) && "admin123".equals(password)) {
            response.sendRedirect("dashboard.jsp");
        } else {
            out.println("<script>alert('Invalid login'); window.location='login.jsp';</script>");
        }
    }
}
