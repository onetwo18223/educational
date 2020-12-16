package com.bhh.imooc.edusystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class EduSystemApplication {

    public static void main(String[] args) {

        ConfigurableEnvironment environment =
                SpringApplication.run(EduSystemApplication.class, args).
                        getEnvironment();

        log.info("system启动成功！");
        log.info("system地址：http://{}:{}",
                environment.getProperty("server.address"),
                environment.getProperty("server.port"));
    }
}
