package com.example.demowebprojectee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Aplicacion {

    @Bean
    public MyBlogs blog(){
        return new MyBlogs();
    }

}