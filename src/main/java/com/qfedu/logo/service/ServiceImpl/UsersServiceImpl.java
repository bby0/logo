package com.qfedu.logo.service.ServiceImpl;

import com.qfedu.logo.mapper.UsersMapper;
import com.qfedu.logo.pojo.Users;
import com.qfedu.logo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;


    //登录功能
    public Users login(Users user) {
        return usersMapper.selectByNameAndPass(user);
    }

    //注册
    public int registerUser(Users users){
        return usersMapper.registerUser(users);
    }

    //shiro登录
    @Override
    public Users findNameAndPwd(String username) {
        return usersMapper.findNameAndPwd(username);
    }

    //查询用户的真实信息进行认证
    @Override
    public Users selectByName(Users user) {
        return usersMapper.selectByName(user);
    }

    @Override
    public List<Users> selectAllUsers() {
        return usersMapper.selectAllUsers();
    }


}
