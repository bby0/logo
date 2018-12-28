package com.qfedu.logo.service;

import com.qfedu.logo.pojo.Permission;

import java.util.List;

public interface PermissionService {

    //查询所有的权限
    List<Permission> select();

    //添加
    int insertSelective(Permission permission);
}
