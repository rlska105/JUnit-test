package com.example.calculation.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;
    private String author;
    private String content;

    @Builder
    public Posts(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }


}
