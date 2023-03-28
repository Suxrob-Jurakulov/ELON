package com.company.repository;

import com.company.dto.PostDTO;
import com.company.entity.PostEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepositoryImpl {

//    public List<PostDTO> showPostList() {
//        String sql = "select u.name as sotuvchi, u.username, u.phone as s_phone, " +
//                "p.title as mahsulot_nomi, p.price, p.description, \n" +
//                "p.created_at from post p join users u on p.userId = u.id where p.status = 'ACTIVE'";
//
//        return jdbcTemplate.query(sql, new PostListMapper());
//    }
//
//    public List<PostDTO> postListByUser() {
//
//    }

//
//    public boolean isPostExist(Integer id) {
//
//    }
//
//    public void editPost(PostEntity post) {
//
//
//    }
//
//    public void deletePost(Integer id) {
//
//
//    }
//
//    public boolean isPostDeleted(Integer id) {
//
//    }
}
