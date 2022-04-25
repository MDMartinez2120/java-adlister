import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    // below are the request and response objects they are in the do get parameters
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // line 13 sends a response to the server to say hello world
        res.getWriter().println("hello world");
    }
}