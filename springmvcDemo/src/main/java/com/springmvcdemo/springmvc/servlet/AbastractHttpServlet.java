package com.springmvcdemo.springmvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: AbastractHttpServlet
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-21 00:53
 * @Version: 1.0
 **/
public abstract class AbastractHttpServlet extends HttpServlet {

    private static final long serialVersionUID = 2925904517673198105L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPatch(req,resp);
    }

    protected abstract void doPatch(HttpServletRequest req, HttpServletResponse resp);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
