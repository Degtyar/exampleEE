package ru.degtyar.enterprise.serverlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = Error.NAME, urlPatterns = {"/error"})
public class Error extends HttpServlet {
    public static final String NAME = "Error";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/noffind.jsp").forward(req, resp);
    }
}