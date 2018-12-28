package com.qfedu.logo.controller;


import com.qfedu.logo.pojo.Goods;
import com.qfedu.logo.pojo.Img;
import com.qfedu.logo.service.GoodsService;
import com.qfedu.logo.util.RUtil;
import com.qfedu.logo.vo.R;
import com.qfedu.logo.vo.ResponseVo;
import org.apache.ibatis.annotations.Param;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    /**
     * 添加商品
     * @param gname
     * @param price
     * @param descs
     * @param typeid
     * @param multipartFile
     * @return
     * @throws IOException
     */
    @RequestMapping(path = "/goods",method = RequestMethod.POST)
    public R<Goods> addGoods(String gname, String price,
                             String descs, String typeid,
                             @RequestParam("imgs") MultipartFile[] multipartFile) throws IOException {


        System.out.println(multipartFile);
        Integer typeId = Integer.valueOf(typeid);
        goodsService.addGoods(gname,price,descs,typeId,multipartFile);

        return RUtil.setOK("添加成功");

    }

    /**
     * 测试
     */
//    @RequestMapping("/goods")
//    public R addGoods(Goods goods) {
//
//       return goodsService.addGoods(goods);
//    }

    /**
     * 根据商品类别tid获得此类别下的所有商品
     */
    @RequestMapping(path="/getGoods",method = RequestMethod.GET)
    public ResponseVo<Goods> getGoods(@RequestParam(value = "tid",required = true) String tid, Integer pageNum, Integer pageSize) {


//System.out.println(tid);


        if (tid==null) {
           Integer Tid =1;


            return goodsService.getGoods(Tid,pageNum, pageSize);
        } else {
            Integer Tid = Integer.valueOf(tid);
            return goodsService.getGoods(Tid,pageNum, pageSize);


        }



    }
    /**
     * 根据商品id查询该商品所有信息
     */
    @RequestMapping(path = "/goodsDetail",method = RequestMethod.GET)
    public Goods goodsDetails(Integer gid) {
        
        System.out.println(gid);
        Integer Gid = Integer.valueOf(gid);
        
        return goodsService.goodsDetail(Gid);
    }
    
    
    @RequestMapping(path = "/getGoodsImg",method = RequestMethod.GET)
    public List<Goods> goodsImg(Integer gid) {
        
        System.out.println(gid);
        Integer Gid = Integer.valueOf(gid);
        
        return goodsService.getGoodsImg(gid);
    }
    
    @GetMapping("/wselectGoodsByShopcarId")
    public List<Goods> wselectGoodsByShopcarId(String[] shopcarIds){
        
        for (int i = 0; i < shopcarIds.length; i++) {
            System.out.println(shopcarIds[i]);
        }
        return goodsService.wselectGoodsByShopcarId(shopcarIds);
    }

    @RequestMapping(path = "getImg",method = RequestMethod.GET)
    public ResponseVo<Img> getImg(Integer goodsid) {

        return goodsService.getImg(goodsid);

    }
    
    
    
}
