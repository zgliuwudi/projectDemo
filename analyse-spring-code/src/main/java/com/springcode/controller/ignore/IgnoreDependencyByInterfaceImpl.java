package com.springcode.controller.ignore;

import java.util.List;

/**
 * @ClassName: IgnoreDependencyByInterfaceImpl
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-12 08:38
 * @Version: 1.0
 **/
public class IgnoreDependencyByInterfaceImpl implements IgnoreDependencyByInterfaceSrv {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
