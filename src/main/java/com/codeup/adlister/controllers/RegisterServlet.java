package com.codeup.adlister.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("username");
        String submit = request.getParameter("psw");

        request.getRequestDispatcher("/WEB-INF/register.jsp");
        // TODO: ensure the submitted information is valid
        boolean validAttempt = false;

        if (validAttempt) {
            // TODO: store the logged in user object in the session, instead of just the username
            request.getSession().setAttribute("user", email);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/WEB-INF/register");
        }
    }
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
}
