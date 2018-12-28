package com.qfedu.logo.service;

import com.qfedu.logo.pojo.Users;

import java.util.List;

public interface UsersService {


    //用户登录
    Users login(Users user);

    //注册
    public int registerUser(Users users);

    //查询用户name和password登录
    Users findNameAndPwd(String username);

    //查询用户的真实信息
    Users selectByName(Users user);

    //查询所有的用户的信息
    List<Users> selectAllUsers();

}
