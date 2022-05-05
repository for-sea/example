package com.forsea.example.controller;

import com.forsea.example.pojo.UserDO;
import com.forsea.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/user/{uid}")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public UserDO getUserByUid(@PathVariable("uid") Integer uid){
        UserDO user = userService.getUserByUid(uid);
        return user;
    }
}
