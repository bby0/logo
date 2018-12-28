package com.qfedu.logo.controller;


import com.qfedu.logo.pojo.Type;
import com.qfedu.logo.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class TypeController {

    @Autowired
    //@Qualifier("testService")
    private TypeService typeService;


    @RequestMapping("/type")
    public List<Type> Test() {


        return typeService.types();
    }
}
