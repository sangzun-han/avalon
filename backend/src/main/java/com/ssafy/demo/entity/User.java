package com.ssafy.demo.entity;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity @AllArgsConstructor @NoArgsConstructor @Getter
public class User {

    @Id
    private String nickname;

    @Column(nullable = false)
    public String kakao_id;

    @OneToOne(mappedBy = "user")
    private PlayRoom playroom;

    @OneToOne(mappedBy = "user")
    private playUser playuser;

    @OneToOne(mappedBy = "user")
    private Token token;




   @Builder
    public void UserVo(String nickname, String kakao_id){
       this.nickname=nickname;
       this.kakao_id=kakao_id;
   }


}
