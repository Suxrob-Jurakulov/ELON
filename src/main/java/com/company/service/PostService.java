package com.company.service;

import com.company.dto.PostDTO;
import com.company.entity.PostEntity;
import com.company.enums.PostStatus;
import com.company.repository.PostRepository;
import com.company.repository.PostRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepositoryImpl postRepositoryImpl;

    @Autowired
    private PostRepository postRepository;

    public void addPost(PostDTO post) {

        PostEntity entity = new PostEntity();
        entity.setTitle(post.getTitle());
        entity.setPrice(post.getPrice());
        entity.setDescription(post.getDescription());
        entity.setCreated_at(Timestamp.valueOf(LocalDateTime.now()));
        entity.setStatus(PostStatus.ACTIVE);
        entity.setUserId(1);

        postRepository.save(entity);

    }

//    public void myPostList() {
//        List<PostDTO> posts = postRepositoryImpl.postListByUser();
//        for (PostDTO post : posts) {
//            System.out.println(post);
//        }
//    }
//
//    public void updatePost(PostDTO post) {
//        if (!postRepositoryImpl.isPostExist(post.getId())) {
//            System.out.println("Kalla bunday posting yo'q seni");
//            return;
//        }
//        if (postRepositoryImpl.isPostDeleted(post.getId())) {
//            System.out.println("This post was deleted!");
//            return;
//        }
//
//        PostEntity entity = new PostEntity();
//        entity.setId(post.getId());
//        entity.setTitle(post.getTitle());
//        entity.setPrice(post.getPrice());
//        entity.setDescription(post.getDescription());
//        entity.setStatus(post.getStatus());
//        entity.setCreated_at(Timestamp.valueOf(LocalDateTime.now()));
//        entity.setUserId(ComponentContainer.currentUser.getId());
//
//        postRepositoryImpl.editPost(entity);
//        System.out.println("Success");
//    }
//
//    public void deletePost(Integer id) {
//        if (!postRepositoryImpl.isPostExist(id)) {
//            System.out.println("Kalla bunday posting yo'q seni");
//            return;
//        }
//
//        if (postRepositoryImpl.isPostDeleted(id)) {
//            System.out.println("This post already deleted!");
//            return;
//        }
//
//        postRepositoryImpl.deletePost(id);
//    }
}
