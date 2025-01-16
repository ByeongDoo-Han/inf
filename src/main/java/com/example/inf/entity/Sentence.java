package com.example.inf.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Sentence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String engSen;
    private String korSen;

    @Builder
    public Sentence(Long id, String engSen, String korSen){
        this.id = id;
        this.engSen = engSen;
        this.korSen = korSen;
    }
}
