package com.Spring.SpringCore.services;

import com.Spring.SpringCore.model.User;
import com.Spring.SpringCore.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@ComponentScan({"com.Spring.SpringCore"})
@EntityScan("com.Spring.SpringCore")
@EnableJpaRepositories("com.Spring.SpringCore.repositories")

public class UserServiceImpl implements UserService{


    private final UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }
}
