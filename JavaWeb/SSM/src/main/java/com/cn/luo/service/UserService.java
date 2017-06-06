package com.cn.luo.service;

import com.cn.luo.model.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    User getUserById(String userId);

    void updateUserEmailById(String userId, String sex);

    void deleteUserById(String userId);

    void insertUser(User user);
}