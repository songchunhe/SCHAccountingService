package com.sch.accounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @program: SCHAccountingService
 * @description:
 * @author: Schwinn
 * @create: 2022-02-28 19:59
 **/
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }
}


