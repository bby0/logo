package com.qfedu.logo.mapper;

import com.qfedu.logo.pojo.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    //插入商品
    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    //查询单独品类的商品展示
    List<Goods> getGoods(Integer tid);

    //查询单个商品详情
    Goods goodsDetail(Integer gid);
    
    List<Goods> selectGoodsById(Integer gid);
    
    //ww订单页面的展示
    List<Goods> wselectGoodsByShopcarId(String[] shopcarIds);

}