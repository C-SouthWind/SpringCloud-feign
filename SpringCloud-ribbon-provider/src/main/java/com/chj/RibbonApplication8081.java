package com.chj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 14:48
 * @params :
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chj.mapper")
public class RibbonApplication8081 {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication8081.class,args);
    }
}
