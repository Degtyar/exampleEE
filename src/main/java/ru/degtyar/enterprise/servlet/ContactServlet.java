package ru.degtyar.enterprise.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = ContactServlet.NAME, urlPatterns = {"/contact"})
public class ContactServlet extends HttpServlet {
    public static final String NAME = "ContactServlet";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/contact.jsp").forward(req, resp);
    }
}
