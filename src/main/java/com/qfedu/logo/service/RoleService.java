package com.qfedu.logo.service;

import com.qfedu.logo.pojo.Role;

import java.util.List;

public interface RoleService {

    //根据用户id查询用户所有的权限
    List<String> selectRoleByUserId(String uid);

    //插入数据
    void insertSelective(Role role);
}
