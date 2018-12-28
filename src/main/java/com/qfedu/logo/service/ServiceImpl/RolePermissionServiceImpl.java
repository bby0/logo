package com.qfedu.logo.service.ServiceImpl;

import com.qfedu.logo.mapper.RolePermissionMapper;
import com.qfedu.logo.pojo.RolePermission;
import com.qfedu.logo.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RolePermissionServiceImpl implements RolePermissionService{

    @Autowired
    private RolePermissionMapper rolePermissionMapperMapper;

    @Override
    public int inserts(List<RolePermission> list) {
        return rolePermissionMapperMapper.inserts(list);
    }
}
