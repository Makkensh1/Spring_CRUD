package com.Spring.SpringCore.controllers;

import com.Spring.SpringCore.UserDTO.UserDTO;
import com.Spring.SpringCore.mappers.UserMapper;
import com.Spring.SpringCore.model.User;
import com.Spring.SpringCore.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable String id) {
        User user = userService.getUser(Long.valueOf(id));
        return UserMapper.INSTANCE.toDTO(user);
    }


}
