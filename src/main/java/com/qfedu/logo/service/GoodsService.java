package com.qfedu.logo.service;

import com.qfedu.logo.pojo.Goods;
import com.qfedu.logo.pojo.Img;
import com.qfedu.logo.vo.ResponseVo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface GoodsService {

    //添加商品
    boolean addGoods(String gname, String price, String descs, Integer typeid, MultipartFile[] multipartFiles) throws IOException;

    //测试
    //R addGoods(Goods goods);

    //商品展示
    ResponseVo<Goods> getGoods(Integer tid, Integer pageNum, Integer pageSize);

    //单个商品详情
    Goods goodsDetail(Integer gid);

    List<Goods> getGoodsImg(Integer gid);

    ResponseVo<Img> getImg(Integer goodsid);

    //ww
    List<Goods> wselectGoodsByShopcarId(String[] shopcarIds);

}