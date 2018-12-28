package com.qfedu.logo.service;

import com.qfedu.logo.pojo.Shopcar;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShopCarService {
    List<Shopcar> selectByGoodsId(Shopcar shopcar);

    List<Shopcar> selectByGoodsId1(Shopcar shopcar);

    int insertByGidAndGnum(Shopcar shopcar);

    public boolean updateByGoodsIdAndUserId(Shopcar shopcar);

    public boolean updateByPrimaryKey(Shopcar shopcar);

    public boolean delByShopcarId(Integer[] shopcarIds);

    public Shopcar selectByShopcarId(Shopcar shopcar);
}
