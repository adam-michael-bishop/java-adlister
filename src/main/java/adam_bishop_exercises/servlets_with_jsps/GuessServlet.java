package adam_bishop_exercises.servlets_with_jsps;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/servlets_with_jsps/guess.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random rand = new Random();
        String[] rpsChoices = {"rock", "paper", "scissors"};
        String userChoice = req.getParameter("rps-choice");
        String computerChoice = rpsChoices[rand.nextInt(rpsChoices.length)];
        RequestDispatcher dispatcher;
        req.setAttribute("computerChoice", computerChoice);
        req.setAttribute("userChoice", userChoice);

        if (computerChoice.equals(userChoice)) {
            req.setAttribute("outcome", "tie");
            dispatcher = req.getRequestDispatcher("/incorrect");
        } else if ((computerChoice.equals(rpsChoices[0]) && userChoice.equals(rpsChoices[1])) ||
                (computerChoice.equals(rpsChoices[1]) && userChoice.equals(rpsChoices[2])) ||
                (computerChoice.equals(rpsChoices[2]) && userChoice.equals(rpsChoices[0]))) {
            req.setAttribute("outcome", "win");
            dispatcher = req.getRequestDispatcher("/correct");
        } else {
            req.setAttribute("outcome", "lose");
            dispatcher = req.getRequestDispatcher("/incorrect");
        }
        dispatcher.forward(req, resp);
    }
}
