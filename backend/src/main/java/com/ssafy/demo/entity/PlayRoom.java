package com.ssafy.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PlayRoom {

    @Id
    long room_id;

    @OneToOne
    @JoinColumn(name = "host_nickname")
    @Column(nullable = false)
    User user;


    @Column(nullable = false)
    LocalDateTime create_time;

    @OneToMany(mappedBy = "playroom")
    List<PlayRoom> playRooms= new ArrayList<>();





}
