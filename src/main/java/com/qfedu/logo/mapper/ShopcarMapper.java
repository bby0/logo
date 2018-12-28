package com.qfedu.logo.mapper;

import com.qfedu.logo.pojo.Shopcar;

import javax.validation.constraints.Max;
import java.util.List;
import java.util.Map;

public interface ShopcarMapper {
    int deleteByPrimaryKey(Integer shopcarId);

    int insert(Shopcar record);

    int insertSelective(Shopcar record);

    Shopcar selectByPrimaryKey(Integer shopcarId);

    int updateByPrimaryKeySelective(Shopcar record);

    int updateByPrimaryKey(Shopcar record);

    //根据用户id查找购物车对应的信息
    List<Shopcar> selectByGoodsId(Shopcar shopcar);
    List<Shopcar> selectByGoodsId1(Shopcar shopcar);

    //根据购物车id查找信息
    Shopcar selectByShopcarId(Shopcar shopcar);

    //根据用户的id和商品的id修改购物车的状态和下单数量
    int updateByGoodsIdAndUserId(Shopcar shopcar);

    //根据购物车的id批量删除信息
    int deleteByShopcarIds(Integer[] shopcarIds);
}