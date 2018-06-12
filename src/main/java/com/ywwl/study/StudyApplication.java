package com.ywwl.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author yanuun
 * @Date 20:13 2018/5/17
 **/
@EnableEurekaServer
@SpringBootApplication
public class StudyApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(StudyApplication.class).web(true).run(args);
    }

}
