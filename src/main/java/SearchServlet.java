import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // in line 14 this we are going to make a form for the user to interact with
       resp.getWriter().println("<h1>Hello World</h1>");
       String html = "<form method='POST'>";
       html += "<label>Search</label>";
       html+= "<input name='search' id='search' placeholder='enter search term'>";
       html+= "<br>";
       html += "<button>Search</button>";
       html += "</form>";
       resp.getWriter().println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String searchTerm = req.getParameter("search");
        System.out.println(searchTerm);
        //redirect user to search result servlet
        resp.sendRedirect("/search/results?search="+searchTerm);
    }

}
