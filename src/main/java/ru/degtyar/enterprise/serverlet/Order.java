package ru.degtyar.enterprise.serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = Order.NAME, urlPatterns = {"/order"})
public class Order extends HttpServlet {
    public static final String NAME = "Order";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/template.jsp").forward(req, resp);
    }
}
