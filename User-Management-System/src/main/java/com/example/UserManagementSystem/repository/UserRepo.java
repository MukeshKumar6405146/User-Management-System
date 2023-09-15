package com.example.UserManagementSystem.repository;

import com.example.UserManagementSystem.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class UserRepo {
    public List<User> userList = new ArrayList<>();

    public UserRepo(){
        User tempData = new User(1,"Mukesh Lomror","india","1234567890");
        userList.add(tempData);
    }

    public void saveAll(List<User> users){
        userList.addAll(users);
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<User> getUserById(Integer id) throws NoSuchElementException {
        List<User> user = new ArrayList<>();
        for(User ele :userList){
            if(ele.getUserId() == id){
                user.add(ele);
                return user;
            }
        }
        throw new NoSuchElementException("User with ID " + id + " not found");
    }

    public void updateUserInfo(Integer id, String name) {
        for(User ele : userList){
            if(ele.getUserId()==id){
                ele.setUserName(name);
            }
        }
    }

    public List<User> deleteUserById(Integer id) throws NoSuchElementException{
        for(User ele: userList){
            if(ele.getUserId()==id){
                userList.remove(ele);
                return userList;
            }
        }
        throw new NoSuchElementException("User with ID " + id + " not found");
    }
}
