package com.qfedu.logo.mapper;

import com.qfedu.logo.pojo.OrderLine;

public interface OrderLineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderLine record);

    int insertSelective(OrderLine record);

    OrderLine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderLine record);

    int updateByPrimaryKey(OrderLine record);
}