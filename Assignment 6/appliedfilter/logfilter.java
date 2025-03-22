package filters;
import java.io.IOException;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class LoggingFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String clientIP = request.getRemoteAddr();
        String requestedURL = httpRequest.getRequestURL().toString();

        System.out.println("[" + new Date() + "] Request from IP: " + clientIP + " to URL: " + requestedURL);

        chain.doFilter(request, response);
    }
}
