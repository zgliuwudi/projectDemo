package com.springmvcdemo.springmvc.handlermapping;

import com.springmvcdemo.springmvc.handler.QueryUserHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: BeanNameHandlerMapping
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-21 01:06
 * @Version: 1.0
 **/
public class BeanNameHandlerMapping implements HandlerMapping {

    public BeanNameHandlerMapping() {
        init();
    }

    private Map<String, Object> handlerMappings = new HashMap<>();

    private void init(){
        handlerMappings.put("/queryUser", new QueryUserHandler());
    }

    @Override
    public Object getHandler(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        System.out.println("requestURI="+requestURI);
        return handlerMappings.get(requestURI);
    }
}
