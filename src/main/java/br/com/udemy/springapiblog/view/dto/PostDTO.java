package br.com.udemy.springapiblog.view.dto;

import lombok.Data;

@Data
public class PostDTO {
    private long id;
    private String title;
    private String description;
    private String content;
}
