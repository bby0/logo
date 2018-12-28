package com.qfedu.logo.service.ServiceImpl;

import com.qfedu.logo.mapper.ShopcarMapper;
import com.qfedu.logo.pojo.Shopcar;
import com.qfedu.logo.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCarServiceImpl implements ShopCarService {
    @Autowired
    private ShopcarMapper shopcarMapper;

    //根据商品的id连表查询购物的信息
    @Override
    public List<Shopcar> selectByGoodsId(Shopcar shopcar) {

        //由于一个商品会有多张图片，因此会有对条数据
        return shopcarMapper.selectByGoodsId(shopcar);
    }

    @Override
    public List<Shopcar> selectByGoodsId1(Shopcar shopcar) {
        return shopcarMapper.selectByGoodsId1(shopcar);
    }

    //根据商品id和商品数量加入购物车
    @Override
    public int insertByGidAndGnum(Shopcar shopcar) {

        return shopcarMapper.insertSelective(shopcar);
    }


    //根据用户的id和商品的id修改购物车的状态和下单数量
    @Override
    public boolean updateByGoodsIdAndUserId(Shopcar shopcar) {

        return shopcarMapper.updateByGoodsIdAndUserId(shopcar) > 0 ? true : false;
    }

    @Override
    public boolean updateByPrimaryKey(Shopcar shopcar) {
        return shopcarMapper.updateByPrimaryKey(shopcar) > 0 ? true : false;
    }

    @Override
    public boolean delByShopcarId(Integer[] shopcarIds) {
        return shopcarMapper.deleteByShopcarIds(shopcarIds) > 0 ? true : false;
    }

    @Override
    public Shopcar selectByShopcarId(Shopcar shopcar) {
        return shopcarMapper.selectByShopcarId(shopcar);
    }


}
