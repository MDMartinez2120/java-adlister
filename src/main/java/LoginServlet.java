import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, rep);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        if (req.getMethod().equalsIgnoreCase("post")) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            if (username.equals("admin") && password.equals("password")) {
                res.sendRedirect("/login.jsp");
            }
        }
    }
};
