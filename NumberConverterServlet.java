package com.example.servlets;



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NumberConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputNumberStr = request.getParameter("inputNumber");
        int inputNumber = Integer.parseInt(inputNumberStr);

        // Perform conversion (e.g., multiply by 2)
        int result = inputNumber * 2;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Number Conversion Result:</h2>");
        out.println("Input Number: " + inputNumber + "<br>");
        out.println("Converted Result: " + result);
        out.println("</body></html>");
    }
}
