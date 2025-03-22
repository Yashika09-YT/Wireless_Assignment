package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BasicServlet")
public class BasicServlet extends HttpServlet {
    
    // Handling GET Request
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h2>Welcome to Java Servlet!</h2>");
        out.println("<p>This is a response from the doGet() method.</p>");
        out.println("</body></html>");
    }

    // Handling POST Request
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        
        out.println("<html><body>");
        out.println("<h2>Form Submitted Successfully!</h2>");
        out.println("<p>Welcome, " + name + "!</p>");
        out.println("</body></html>");
    }
}
