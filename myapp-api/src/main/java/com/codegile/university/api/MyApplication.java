package com.codegile.university.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.codegile.university.repository",
        "com.codegile.university.service",
        "com.codegile.university.api"})
public class MyApplication extends SpringBootServletInitializer {
}
