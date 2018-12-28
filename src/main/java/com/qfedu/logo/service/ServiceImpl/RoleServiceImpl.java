package com.qfedu.logo.service.ServiceImpl;

import com.qfedu.logo.mapper.RoleMapper;
import com.qfedu.logo.pojo.Role;
import com.qfedu.logo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;

    //查询用户所有角色
    @Override
    public List<String> selectRoleByUserId(String uid) {
        List<String> list = roleMapper.selectRoleById(uid);
        return list;
    }

    //插入数据
    @Override
    public void insertSelective(Role role) {
        roleMapper.insertSelective(role);
    }
}
