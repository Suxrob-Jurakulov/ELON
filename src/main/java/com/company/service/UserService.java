package com.company.service;


import com.company.controller.UserController;
import com.company.dto.UserDTO;
import com.company.entity.UserEntity;
import com.company.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepositoryImpl userRepository;
    @Autowired
    private UserController userController;

//    public void auth(String login, String password) {

//        UserEntity user = userRepository.checkUser(login, password);
//        if (user == null){
//            System.out.println("Mazgi. Xato terding!");
//            return;
//        }
//        UserDTO userDTO = new UserDTO();
//        userDTO.setId(user.getId());
//        userDTO.setName(user.getName());
//        userDTO.setUsername(user.getUsername());
//        userDTO.setPhone(user.getPhone());
//        userDTO.setPassword(user.getPassword());
//
//        ComponentContainer.currentUser = userDTO;
//        userController.userMenu();
//    }

}
