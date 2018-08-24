package ru.degtyar.enterprise.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = MainServlet.NAME, urlPatterns = {"/main"})
@ServletSecurity(
        @HttpConstraint(rolesAllowed = {"admin","adm"}, transportGuarantee = ServletSecurity.TransportGuarantee.NONE))
public class MainServlet extends HttpServlet {
    public static final String NAME = "MainServlet";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/main.jsp").forward(req, resp);
    }
}
