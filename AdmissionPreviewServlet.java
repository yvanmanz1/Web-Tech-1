import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
package com.example.servlets;

public class AdmissionPreviewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("studentName");
        String course = request.getParameter("course");
        int age = Integer.parseInt(request.getParameter("age"));

        // Process data and generate preview
        String preview = "Student Name: " + studentName + "<br>"
                + "Course: " + course + "<br>"
                + "Age: " + age;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Admission Preview:</h2>");
        out.println(preview);
        out.println("</body></html>");
    }
}
