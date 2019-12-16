package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication  //声明服务的入口
@EnableEurekaServer     //声明为EurekaServer微服务,提供服务的注册与发现(服务注册中心);
public class EurekaerverApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaerverApplication.class,args);
    }

}
