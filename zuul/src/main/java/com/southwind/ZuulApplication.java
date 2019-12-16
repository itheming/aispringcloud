package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy    //设置该类是网关的启动类
@EnableAutoConfiguration    //帮助spring'boot应用 将所有符合条件的@Configuration 配置加载到当前spring'boot 创建并使用的ioc容器
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
