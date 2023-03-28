package com.company.entity;

import com.company.enums.PostStatus;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "post")
@Data
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column
    private Double price;

    @Column
    private String description;

    @Column
    private Timestamp created_at;

    @Column
    @Enumerated(EnumType.STRING)
    private PostStatus status;

    @Column(name = "user_id")
    private Integer userId;
}
