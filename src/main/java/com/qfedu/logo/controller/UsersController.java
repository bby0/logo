package com.qfedu.logo.controller;

import com.qfedu.logo.pojo.Users;
import com.qfedu.logo.service.UsersService;
import com.qfedu.logo.util.RUtil;
import com.qfedu.logo.vo.R;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
public class UsersController {

    @Autowired
    private UsersService userService;

    // 登录功能
    @RequestMapping("/logins")
    public R<Users> login(Users user, HttpServletResponse response, HttpSession session){
        Users userR = userService.login(user);
        //response.addHeader("Access-Control-Allow-Origin", "*");
        //response.setHeader("Access-Control-Allow-Methods", "POST, GET, PATCH, DELETE, PUT");

        if (userR != null){
            session.setAttribute("user", userR);
            return RUtil.setOK("2000");
        }else {
            return RUtil.setERROR("1000");
        }
    }

    @RequestMapping("/addUser")
    public void registerUser(Users users, HttpServletResponse response) throws IOException {

        int i = userService.registerUser(users);

        try {
            response.getWriter().print("<script>alert(" + (i > 0 ? "'success'" : "'error") + ");history.back()</script>");
        }catch (Exception e){

            e.printStackTrace();
        }
    }


    //权限登录
    @RequestMapping("/loginShiro")
    public String LoginShiro(HttpServletRequest request, String username, String password){
        UsernamePasswordToken up = new UsernamePasswordToken();
        Subject sub = SecurityUtils.getSubject();

        try {
            sub.login(up);
            Users userR = userService.findNameAndPwd(username);
            request.getSession().setAttribute("username", userR);
            return "redirect:index.hmtl";
        }catch (Exception e){
            return  "redirect:login.html";
        }
    }


    //查询所有的用户
    @GetMapping("/getAllUsers")
    public R selectAllUsers() {
        List<Users> users = userService.selectAllUsers();
        R<Object> r = new R<>();
        r.setData(users);
        return r;
    }


}
