package com.ssafy.demo.repository;

import com.ssafy.demo.dto.UserDTO;
import com.ssafy.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepo extends CrudRepository<User,String> {
}
