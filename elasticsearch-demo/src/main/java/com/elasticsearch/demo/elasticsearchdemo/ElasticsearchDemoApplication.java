package com.elasticsearch.demo.elasticsearchdemo;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableKnife4j
@EnableSwagger2
@SpringBootApplication
public class ElasticsearchDemoApplication {

    /**
     * 访问地址： http://127.0.0.1:8080/swagger-ui.html#/
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchDemoApplication.class, args);
    }

}
