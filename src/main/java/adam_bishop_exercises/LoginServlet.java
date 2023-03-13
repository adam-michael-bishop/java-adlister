package adam_bishop_exercises;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("username") == null || request.getParameter("password") == null) {
            response.sendRedirect("/login.jsp");
        } else if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
            request.setAttribute("username", request.getParameter("username"));
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        }
    }
}
