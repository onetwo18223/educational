package com.bhh.imooc.edusystem.controller;


import com.bhh.imooc.edusystem.domain.dto.UserDTO;
import com.bhh.imooc.edusystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bhh
 * @since 2020-12-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getById/{id}")
    public UserDTO getById(@PathVariable("id")String id){

        return userService.getUserById((long) Integer.parseInt(id));
    }
}

