package com.qfedu.logo.mapper;

import com.qfedu.logo.pojo.Type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    //商品类型
    List<Type> select();
}