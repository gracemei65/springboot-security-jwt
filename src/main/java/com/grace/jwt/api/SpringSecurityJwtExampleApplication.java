package com.grace.jwt.api;

import com.grace.jwt.api.entity.User;
import com.grace.jwt.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "gracemei65", "Yh89@65mg", "gracemei6589@gmail.com"),
                new User(102, "John", "John1228", "johngao52@yahoo.com>,"),
                new User(103, "Joe", "Joe0121", "joegung77@yahoo.com>,")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
