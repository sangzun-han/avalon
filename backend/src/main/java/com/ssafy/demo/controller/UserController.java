package com.ssafy.demo.controller;

import com.ssafy.demo.entity.User;
import com.ssafy.demo.repository.UserRepo;
import com.ssafy.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController @Slf4j
public class UserController {


    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;


    @GetMapping("/user/list")
    public ResponseEntity GetAllUsers(){
        return new ResponseEntity(userService.findAll(),HttpStatus.OK);
    }
    // 모든 유저 가져오기


    @GetMapping("/user/search/{nick}")
    public ResponseEntity<User> findByName(@PathVariable String nickName){
        return new ResponseEntity(userService.find(nickName),HttpStatus.OK);
    }
    // 특정 유저 키값으로 가져오기

    @DeleteMapping("/user/delete/{nick}")
    public ResponseEntity<User> deleteByName(@PathVariable String nickName){
        try{
            userService.deleteByName(nickName);
        }
        catch (Exception e){
            return new ResponseEntity(false,HttpStatus.OK);
        }
        return new ResponseEntity(true,HttpStatus.OK);
    }
    // 특정 유저 키값으로 찾아서 지우기

    @PutMapping("/user/save")
    public ResponseEntity<User> UserSave(){


        HttpServletRequest req;
        //req.getParameter();


        return new ResponseEntity(null,HttpStatus.OK);
    }








    // 로그 기록 api
    // 로그 제거

    // 로그양식 필요함 .


    // 유저 업데이트 ?
    // 유저 저장
    // 유저검색 V

    // 방정보 관련 crud

    // 온라인인 유저 관련 crud











}
