package com.qfedu.logo.service.ServiceImpl;

import com.qfedu.logo.mapper.PermissionMapper;
import com.qfedu.logo.pojo.Permission;
import com.qfedu.logo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionServiceImpl implements PermissionService{

    @Autowired
    private PermissionMapper permissionMapper;

    //查询所有的权限
    @Override
    public List<Permission> select() {
        return permissionMapper.select();
    }

    //添加
    @Override
    public int insertSelective(Permission permission) {
        return permissionMapper.insertSelective(permission);
    }
}
