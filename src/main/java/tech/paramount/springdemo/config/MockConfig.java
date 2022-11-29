package tech.paramount.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import tech.paramount.springdemo.nameprovider.NameProvider;

@Configuration
public class MockConfig {

    @Bean
    @Profile("stage")
    public NameProvider userNameMock() {
        return () -> "John";
    }
}
