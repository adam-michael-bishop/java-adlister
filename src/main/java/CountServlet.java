import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count2")
public class CountServlet extends HttpServlet {
    private int count = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("reset") != null && req.getParameter("reset").equals("true")) {
            count = 0;
        }
        count++;
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("This page has been visited " + count + " time(s)");
    }
}
