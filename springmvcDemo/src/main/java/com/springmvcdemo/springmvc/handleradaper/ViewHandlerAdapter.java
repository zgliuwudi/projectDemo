package com.springmvcdemo.springmvc.handleradaper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: ViewHandlerAdapter
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-21 01:17
 * @Version: 1.0
 **/
public class ViewHandlerAdapter implements HandlerAdapter {
    @Override
    public void handlerRequest(Object hander, HttpServletRequest req, HttpServletResponse resp) throws Exception{
        resp.getWriter().println("ViewHandlerAdapter");
    }
}
