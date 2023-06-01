package com.ssafy.demo.controller;

import com.ssafy.demo.entity.User;
import com.ssafy.demo.repository.UserRepo;
import com.ssafy.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @Slf4j
public class UserController {


    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public ResponseEntity GetAllUsers(){

        log.debug("@#@");
        log.debug(userService.findAll().toString());

        return new ResponseEntity(userService.findAll(),HttpStatus.OK);

    }
    @GetMapping("/search/{nick}")
    public ResponseEntity<User> findByName(@PathVariable String nickName){


        return new ResponseEntity(userService.find(nickName),HttpStatus.OK);
    }




}
