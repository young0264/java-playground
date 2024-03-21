package org.main.basic.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OncePerRequestFilterApp {
    public static void main(String[] args) {
        SpringApplication.run(OncePerRequestFilterApp.class, args);
    }
}