package adam_bishop_exercises.servlets_with_jsps;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/servlets_with_jsps/pizza-order.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("\nNew Order:");
        System.out.println("crust-type: " + req.getParameter("crust-type"));
        System.out.println("sauce-type: " + req.getParameter("sauce-type"));
        System.out.println("size: " + req.getParameter("size"));
        System.out.println("toppings: " + Arrays.toString(req.getParameterValues("topping")));

        req.setAttribute("orderSubmitted", "true");
        req.getRequestDispatcher("/servlets_with_jsps/pizza-order.jsp").forward(req, resp);
    }
}
