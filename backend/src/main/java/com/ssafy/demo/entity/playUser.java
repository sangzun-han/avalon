package com.ssafy.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class playUser {

    @Id
    @ManyToOne
    @JoinColumn(name = "room_id")
    PlayRoom playRoom;

    @OneToOne
    @JoinColumn(name = "nickname")
    @Column(nullable = false)
    User user;


}
