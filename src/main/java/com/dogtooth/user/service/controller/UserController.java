package com.dogtooth.user.service.controller;

import com.dogtooth.user.service.VO.ResponseTemplateVO;
import com.dogtooth.user.service.entity.User;
import com.dogtooth.user.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {

        log.info("Inside saveUser method of UserController");
        return userService.saveUser(user);

    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {

        log.info("Inside getUserWithDepartment method of UserController");
        return userService.getUserWithDepartment(userId);

    }

}
