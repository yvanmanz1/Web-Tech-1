import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check credentials (you can use a database for this)
        if ("yourUsername".equals(username) && "yourPassword".equals(password)) {
            // Successful login
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2>Login Successful!</h2>");
            out.println("</body></html>");
        } else {
            // Invalid credentials
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2>Login Failed. Invalid Credentials!</h2>");
            out.println("</body></html>");
        }
    }
}
