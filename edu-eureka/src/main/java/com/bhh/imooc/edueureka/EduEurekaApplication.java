package com.bhh.imooc.edueureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EduEurekaApplication {

    public static void main(String[] args) {

        SpringApplication app =
                new SpringApplication(EduEurekaApplication.class);

        Environment env =
                app.run(args).getEnvironment();
        log.info("edu-eureka启动成功！");
        log.info("enu-eureka地址：http://{}:{}",
                env.getProperty("server.address"),
                env.getProperty("server.port"));
    }
}
