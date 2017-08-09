package com.whh;

import com.whh.config.SpringBootMainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootMain
 * Created by xuzhuo on 2017/8/8.
 */
@SpringBootApplication
public class SpringBootMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainConfig.class, args);
    }
}
