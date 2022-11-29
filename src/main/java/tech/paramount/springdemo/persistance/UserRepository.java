package tech.paramount.springdemo.persistance;

import org.springframework.data.repository.CrudRepository;
import tech.paramount.springdemo.user.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAllByName(String userName);
}

