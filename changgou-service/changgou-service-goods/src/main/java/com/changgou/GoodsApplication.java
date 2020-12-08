package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 描述
 *
 * @author fancy
 * @version 1.0
 * @since 1.0
 */
@SpringBootApplication
@EnableEurekaClient //开启Eureka客户端
@EnableSwagger2 //开启Swagger接口管理页面
//注意 要使用通用的mapper的组件扫描
//@MapperScan(basePackages = {"com.changgou.goods.mapper"})
//包扫描已经在config文件中申明过，此处不需要再重复
public class GoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}
