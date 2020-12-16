package com.bhh.imooc.edugateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.ConfigurableEnvironment;

@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class EduGatewayApplication {

    public static void main(String[] args) {
        ConfigurableEnvironment environment =
                SpringApplication.run(EduGatewayApplication.class, args).
                        getEnvironment();
        log.info("Gateway启动成功！");
        log.info("Gateway地址：http://{}:{}",
                environment.getProperty("server.address"),
                environment.getProperty("server.port"));
    }

}
