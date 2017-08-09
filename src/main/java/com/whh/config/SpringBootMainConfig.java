package com.whh.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * SpringBootMainConfig
 * Created by xuzhuo on 2017/8/8.
 */
@ComponentScan("com.whh")
@EnableAutoConfiguration
@EnableAsync
public class SpringBootMainConfig {
}
