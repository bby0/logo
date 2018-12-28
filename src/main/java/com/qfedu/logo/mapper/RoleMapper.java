package com.qfedu.logo.mapper;

import com.qfedu.logo.pojo.Role;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    //插入数据
    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    //根据用户id查询用户拥有的权限
    List<String> selectRoleById(String uid);
}