import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")

public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       if (request.getSession().getAttribute("user") == null) {
           response.sendRedirect("/login");
           return;
       }

        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }

};

//    HttpSession session = req.getSession();
//
//        if (req.getParameter("forget") != null) {
//                session.removeAttribute("font-color");
//                session.removeAttribute("bg-color");
//                resp.sendRedirect("/color-profile");
//                } else {
//                session.setAttribute("font-color", req.getParameter("font-color"));
//                session.setAttribute("bg-color", req.getParameter("bg-color"));
//                // redirect user to the "/ads"
//                resp.sendRedirect("/ads");
//                }
//                }
