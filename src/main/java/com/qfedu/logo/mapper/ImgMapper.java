package com.qfedu.logo.mapper;

import com.qfedu.logo.pojo.Img;

import java.util.List;

public interface ImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Img record);

    int insertSelective(Img record);

    Img selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Img record);

    int updateByPrimaryKey(Img record);

    //添加图片
    int insertImg(List<Img> img);

    //获取某商品id下所有的图片
    List<Img> selectImg(Integer goodsid);

}