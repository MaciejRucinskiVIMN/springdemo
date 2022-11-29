package tech.paramount.springdemo.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("stage")
class UserTest {

    @Autowired
    private User user;

    @Test
    void sayHello() {
        assertEquals("Hello, my name is " + user.getName(), user.sayHello());
        System.err.println(user.sayHello());
    }
}

