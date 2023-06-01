package com.ssafy.demo.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserDTO {


    private String nickname;

    public String kakao_id;

    public UserDTO(String nickname, String kakao_id) {
        this.nickname = nickname;
        this.kakao_id = kakao_id;
    }






}
