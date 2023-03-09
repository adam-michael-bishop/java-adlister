package adam_bishop_exercises.servlets_with_jsps;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/servlets_with_jsps/pick-color.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder query = new StringBuilder("?");
        for (Map.Entry<String, String[]> parameter : req.getParameterMap().entrySet()) {
            query.append(parameter.getKey()).append("=").append(URLEncoder.encode(parameter.getValue()[0], StandardCharsets.UTF_8));
        }

        resp.sendRedirect("/viewcolor" + query);
    }
}
