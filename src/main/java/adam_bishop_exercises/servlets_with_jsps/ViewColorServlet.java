package adam_bishop_exercises.servlets_with_jsps;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Field;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String color = req.getParameter("color");
        Color background;
        try {
            Field field = Class.forName("java.awt.Color").getField(color.toUpperCase());
            background = (Color)field.get(null);
        } catch (Exception e) {
            background = Color.white; // Not defined
        }
        System.out.println("background = " + background);
        req.setAttribute("backgroundColor", color);
        req.setAttribute("textColor", getTextColorString(background));
        req.getRequestDispatcher("/servlets_with_jsps/view-color.jsp").forward(req, resp);
    }

    private String getTextColorString(Color background) {
        double composite = (background.getRed() * 0.299) + (background.getGreen() * 0.587) + (background.getBlue() * 0.114);
        System.out.println("composite = " + composite);
        if (composite > 186) {
            return "black";
        }
        return "white";
    }
}
