package com.capgemini.wsb.fitnesstracker.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "com.capgemini.wsb.fitnesstracker")
@EnableScheduling
public class AppConfig {
}