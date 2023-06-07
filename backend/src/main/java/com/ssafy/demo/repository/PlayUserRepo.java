package com.ssafy.demo.repository;

import com.ssafy.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface PlayUserRepo extends CrudRepository<User,String> {
}
