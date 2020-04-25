package com.springmvcdemo.springmvc.handleradaper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: HandlerAdapter
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-21 01:01
 * @Version: 1.0
 **/
public interface HandlerAdapter {
    void handlerRequest(Object hander, HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
