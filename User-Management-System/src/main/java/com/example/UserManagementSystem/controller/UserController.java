package com.example.UserManagementSystem.controller;

import com.example.UserManagementSystem.model.User;
import com.example.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manage")
public class UserController {

    @Autowired
    UserService userService;


    // As we are asked to make five End Points which are give below

// ***************  ADD A USER   **************************
    @PostMapping("user")
    public String saveUser(@RequestBody List<User> users){
        userService.saveAll(users);
        return "user Added successfully";
    }

    // *******************   GET ALL USERS  ***************************
   @GetMapping("all-user")
    public List<User>getAllUsers(){
        return userService.getAllUsers();
   }
//  *********** GET USER BY ID **************************************
    @GetMapping("user/{id}")
    public List<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

// ********************* UPDATE USER INFORMATION **************************
    @PutMapping("{id}/{name}")
    public String updateUserInfo(@PathVariable Integer id, @PathVariable String name){
        userService.updateUserInfo(id, name);
        return "User Info is Updated Successfully";
    }

//  ********** DELETE A USER **********************************
    @DeleteMapping("del-user/{id}")
    public List<User> deleteUserById(@PathVariable Integer id){
        return userService.deleteUserById(id);
    }



}
