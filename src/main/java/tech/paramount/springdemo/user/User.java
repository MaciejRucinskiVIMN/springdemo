package tech.paramount.springdemo.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import tech.paramount.springdemo.nameprovider.NameProvider;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
@Data
@NoArgsConstructor
@Entity(name = "userTable")
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    public User(NameProvider nameProvider) {
        this.name = nameProvider.provideName();
    }

    public String sayHello() {
        return "Hello, my name is " + name;
    }
}

