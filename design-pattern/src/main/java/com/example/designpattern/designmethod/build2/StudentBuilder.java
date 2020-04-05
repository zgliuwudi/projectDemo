package com.example.designpattern.designmethod.build2;

/**
 * @ClassName: StudentBuilder
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 21:13
 * @Version: 1.0
 **/
public class StudentBuilder {

    private Student student = new Student();

    public Student build(){
        return this.student;
    }

    public StudentBuilder id(Integer id){
        this.student.setId(id);
        return this;
    }

    public StudentBuilder name(String name) {
        this.student.setName(name);
        return this;
    }
}
