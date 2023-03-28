package com.company.service;

import com.company.repository.PostRepositoryImpl;
import com.company.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    @Autowired
    private UserRepositoryImpl userRepository;
    @Autowired
    private PostRepositoryImpl postRepository;
//
//    public void registration(UserDTO user) {
//        if (userRepository.isUserExist(user)) {
//            System.out.println("Kalla bunday user mavjud!");
//        } else {
//            UserEntity entity = new UserEntity();
//            entity.setName(user.getName());
//            entity.setPhone(user.getPhone());
//            entity.setUsername(user.getUsername());
//            entity.setPassword(user.getPassword());
//
//            userRepository.saveUser(entity);
//        }
//
//    }
//
//    public void showUsers() {
//        List<UserEntity> users = userRepository.showUsers();
//        for (UserEntity user: users){
//            System.out.println(user);
//        }
//    }
//
//    public void postList() {
//        List<PostDTO> posts = postRepository.showPostList();
//        for (PostDTO post: posts){
//            System.out.println(post);
//        }
//    }
}
