package br.com.udemy.springapiblog.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "POSTS", uniqueConstraints = {@UniqueConstraint(columnNames = {"TITLE"})})
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name="TITLE", nullable = false)
    private String title;

    @Column(name="DESCRIPTION", nullable = false)
    private String description;

    @Column(name="CONTENT", nullable = false)
    private String content;
}
