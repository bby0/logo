package com.qfedu.logo.controller;

import com.qfedu.logo.pojo.Shopcar;
import com.qfedu.logo.pojo.Users;
import com.qfedu.logo.service.ShopCarService;
import com.qfedu.logo.util.RUtil;
import com.qfedu.logo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
//@CrossOrigin
@RestController
public class ShopCarController {
    @Autowired
    private ShopCarService shopCarService;

    //点击加入购物车的事件
    @GetMapping("/getShopByGid")
    public List<Shopcar> getShopByGid(Shopcar shopcar, HttpServletResponse response, HttpSession session) {
        //System.out.println("传入的数据为：" + shopcar);

        /*session还是未取到值
        Users user = (Users)session.getAttribute("user");
        System.out.println("userid : " + user.getUid());*/
        shopcar.setUserId(1);
        // 1.收到请求首先判断购物车中:该用户是否有过该商品对应的购物车信息
        List<Shopcar> list = shopCarService.selectByGoodsId(shopcar);
        System.out.println("当前goodsId为" + shopcar.getGoodsId() + "的购物车数据为： " + list);
        if (list == null || list.equals("") || list.size() == 0) {
            //如果购物车中不存在
            //System.out.println("新添加");
            // 2.如果购物车没有该商品对应的数据：2.1先将数据添加到购物车表中,再进行查询
            int ia = shopCarService.insertByGidAndGnum(shopcar);
            System.out.println("添加" + ia);
        } else {

            //数据库中已经有过该信息，需要将信息进行修改，再进行查询

            shopcar.setGoodsNum(shopcar.getGoodsNum() + list.get(0).getGoodsNum());

            boolean b = shopCarService.updateByGoodsIdAndUserId(shopcar);
            System.out.println("---b" + b);
        }

        //再根据用户的id查询购物车的信息，返回给前端
        System.out.println("goodsId：" + shopcar.getGoodsId());
        //List<Shopcar> maps = shopCarService.selectByGoodsId(shopcar.getGoodsId());

        return shopCarService.selectByGoodsId1(shopcar);
    }


    //根据用户的id查询购物车的信息
    @GetMapping("/getShopByUserId")
    public List<Shopcar> getShopByUserId(Shopcar shopcar, HttpServletResponse response) {
        //获取用户的id
        shopcar.setUserId(1);
        return shopCarService.selectByGoodsId1(shopcar);
    }


    //对商品的数量进行+或者-操作
    @PostMapping("/modifyShopcarNum")
    public R modifyNum(Shopcar shopcar) {
        //根据商品的id用户的id更改商品的数量
        boolean b = shopCarService.updateByPrimaryKey(shopcar);

        //修改完毕后在进行查看单价*数量的金额
        Shopcar shop = shopCarService.selectByShopcarId(shopcar);
        R r = new R();
        r.setData(shop);
        return r;
    }

    //根据主键id删除数据
    @DeleteMapping("/delByShopcarId")
    public R delByShopcarId(@RequestParam("shopcarIds") Integer[] shopcarIds) {
        System.out.println("删除的ids" + shopcarIds);
        boolean b = shopCarService.delByShopcarId(shopcarIds);
        return b ? RUtil.setOK("Success") : RUtil.setERROR("Error");
    }

}
