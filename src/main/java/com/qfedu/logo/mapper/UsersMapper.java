package com.qfedu.logo.mapper;


import com.qfedu.logo.pojo.Users;

import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    //查询名字和密码用于登录
    Users findNameAndPwd(String user);

    //注册
    public int registerUser(Users users);

    //查询用户的真实信息
    Users selectByName(Users user);

    //查询用户登录（不加shiro）
    Users selectByNameAndPass(Users user);

    //查询所有用户的信息
    List<Users> selectAllUsers();
}