package com.justanindieguy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "com.justanindieguy.implementation",
    "com.justanindieguy.services", "com.justanindieguy.aspects" })
@EnableAspectJAutoProxy
public class ProjectConfig {
}
