package tech.paramount.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;
import java.util.Scanner;

@Configuration
public class BeanConfig {

    @Bean
    public Scanner scannerBean(InputStream inputStream) {
        return new Scanner(inputStream);
    }

    @Bean
    public InputStream systemInInputStreamBean() {
        return System.in;
    }

}

