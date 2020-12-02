package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述
 *
 * @author 三国的包子
 * @version 1.0
 * @package com.changgou *
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaServer  //开启Eureka服务
public class EurekaApplication {
    /*
    * 加载启动类，以启动类为当前SpringBoot的配置标准
    * @param args
    */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
