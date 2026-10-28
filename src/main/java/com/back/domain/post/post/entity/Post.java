package com.back.domain.post.post.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // 아래 구조대로 db 테이블 만듬
@Getter
@Setter
public class Post {
    @Id // pk
    @GeneratedValue(strategy = IDENTITY) // auto increment
    private int id; // int
    private String title; // varchar(255)
}
