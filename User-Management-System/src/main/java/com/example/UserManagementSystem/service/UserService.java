package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.model.User;
import com.example.UserManagementSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void saveAll(List<User> users) {
        userRepo.saveAll(users);
    }

    public List<User> getAllUsers() {
        return userRepo.getUserList();
    }


    public List<User> getUserById(Integer id) {
        return userRepo.getUserById(id);
    }

    public void updateUserInfo(Integer id, String name) {
        userRepo.updateUserInfo(id,name);
    }

    public List<User> deleteUserById(Integer id) {
        return userRepo.deleteUserById(id);
    }
}
