package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title; // 제목
    private String contnet; // 본문
    private String hashtag; // 해시테그

    private LocalDateTime createAt; // 생성일시
    private String createBy; //생성자
    private LocalDateTime modifiedAt; //수정일시
    private String modifiedBy; //수정자
}