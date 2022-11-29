package tech.paramount.springdemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.paramount.springdemo.persistance.UserRepository;
import tech.paramount.springdemo.user.User;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserRepository repository;

    @GetMapping("/add/{userName}")
    public String addUser(@PathVariable String userName) {
        User user = new User();
        user.setName(userName);
        repository.save(user);
        return "User %s was added to the database".formatted(user.getName());
    }

    @GetMapping("/get/{userName}")
    public User getUser(@PathVariable String userName) {
        return repository.findAllByName(userName).stream().findFirst().orElseThrow();
    }
}
