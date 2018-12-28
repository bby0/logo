package com.qfedu.logo.service.ServiceImpl;

import com.qfedu.logo.mapper.TypeMapper;
import com.qfedu.logo.pojo.Type;
import com.qfedu.logo.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;


    @Override
    public List<Type> types() {
        return typeMapper.select();
    }
}
