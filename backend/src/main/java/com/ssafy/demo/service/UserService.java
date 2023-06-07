package com.ssafy.demo.service;

import com.ssafy.demo.entity.User;
import com.ssafy.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<User> findAll(){// get all user list
        List<User> users = new ArrayList<>();
        Iterable<User> iterable= userRepo.findAll();
        for(User userEntity: iterable){
                users.add(userEntity);
        }
        return users;
    }

    public void deleteByName(String name){ // delete by name
        userRepo.deleteById(name);
    }



    public List<User> find(String name){// one search

        List<User> arr = new ArrayList<>();
       Iterable<User> iterable= userRepo.findAll();
       for(User userEntity: iterable){
          if(userEntity.getNickname().equals(name)){
              arr.add(userEntity);
          }
       }
        return arr;
    }



}
