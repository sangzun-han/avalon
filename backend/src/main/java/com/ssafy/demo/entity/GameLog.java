package com.ssafy.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Map;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GameLog {

    @Id
    long game_log_id;

    @ManyToOne
    @JoinColumn(name = "play_room_id")
    @Column(nullable = false)
    PlayRoom playroom;

    @Type(type = "json")
    @Column(nullable = false, columnDefinition = "json")
    private Map<String, String> play_data;





}
