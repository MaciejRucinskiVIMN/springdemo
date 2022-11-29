package tech.paramount.springdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tech.paramount.springdemo.user.User;

@SpringBootApplication
@Slf4j
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
	 	User user = context.getBean(User.class);
		log.debug(user.sayHello());
	}

}
