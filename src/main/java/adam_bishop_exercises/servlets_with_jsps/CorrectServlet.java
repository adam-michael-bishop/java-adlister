package adam_bishop_exercises.servlets_with_jsps;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CorrectServlet", urlPatterns = "/correct")
public class CorrectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("isCorrect", "true");
//        req.setAttribute("outcome", req.getAttribute("outcome"));
//        req.setAttribute("userChoice", req.getAttribute("userChoice"));
//        req.setAttribute("computerChoice", req.getAttribute("computerChoice"));
        req.getRequestDispatcher("/servlets_with_jsps/guess-result.jsp").forward(req, resp);
    }
}
