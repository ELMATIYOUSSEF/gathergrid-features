package com.gathergrid.gathergridfeatures.controller;

import jakarta.servlet.ServletException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoginServletTest {
    static LoginServlet servlet = new LoginServlet();

    @Test
    void init() {
    }

    @Test
    void doGet() {
    }

    @Test
    void doPost() {
    }

    @Test
    void register() {
    }

    @Test
    void login() {
    }
    @Test
    void loginValidation() {
        boolean list =servlet.loginValidation("youssef@gmail.com","123");
        assertTrue(list);
    }

    @Test
    void registreValidation() {
    }

    @Test
    void hashPassword() {
    }

    @Test
    void logintest()  {
        assertTrue( servlet.loginValidation("youssef@gmail.com","123") );
    }
}