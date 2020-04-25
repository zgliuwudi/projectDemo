package com.springmvcdemo.springmvc.servlet;

import com.springmvcdemo.springmvc.handler.HttpServletHandler;
import com.springmvcdemo.springmvc.handler.ViewHandler;
import com.springmvcdemo.springmvc.handleradaper.HandlerAdapter;
import com.springmvcdemo.springmvc.handleradaper.HttpServletHandlerAdapter;
import com.springmvcdemo.springmvc.handleradaper.ViewHandlerAdapter;
import com.springmvcdemo.springmvc.handlermapping.BeanNameHandlerMapping;
import com.springmvcdemo.springmvc.handlermapping.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: DispatcherServlet
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-21 00:57
 * @Version: 1.0
 **/
public class DispatcherServlet extends AbastractHttpServlet {
    @Override
    protected void doPatch(HttpServletRequest req, HttpServletResponse resp) {
        Object hander = getHandler(req);
        HandlerAdapter handlerAdapter = getHandlerAdaper(hander);
        try {
            handlerAdapter.handlerRequest(hander,req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private HandlerAdapter getHandlerAdaper(Object hander) {
        if (hander instanceof HttpServletHandler) {
            return new HttpServletHandlerAdapter();
        }
        if (hander instanceof ViewHandler) {
            return new ViewHandlerAdapter();
        }
        return null;
    }

    private Object getHandler(HttpServletRequest req) {
        HandlerMapping mapping = new BeanNameHandlerMapping();
        Object handler = mapping.getHandler(req);
        return handler;
    }
}
