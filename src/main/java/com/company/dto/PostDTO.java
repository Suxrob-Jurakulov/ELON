package com.company.dto;

import com.company.enums.PostStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
    private Integer id;
    private String title;
    private Double price;
    private String description;
    private Timestamp created_at;
    private PostStatus status;
    private UserDTO user;
}
