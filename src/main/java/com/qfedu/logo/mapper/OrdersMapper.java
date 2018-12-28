package com.qfedu.logo.mapper;

import com.qfedu.logo.pojo.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    List<Orders> selectByUserId(Integer userId);
    
   List<Orders> selectOrders(@Param("userId") int userId, @Param("state") int state);
}