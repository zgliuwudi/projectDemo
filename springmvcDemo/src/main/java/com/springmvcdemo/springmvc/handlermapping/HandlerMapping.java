package com.springmvcdemo.springmvc.handlermapping;

import javax.servlet.http.HttpServletRequest;

public interface HandlerMapping {

    Object getHandler(HttpServletRequest request);
}
