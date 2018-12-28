package com.qfedu.logo.pojo;

import java.util.List;

public class Shopcar {
    private Integer shopcarId;

    private Integer userId;

    private Integer goodsId;

    private Integer goodsNum;

    private Integer state;

    private Goods goods;

    private List<Img> imgs;

    private Integer sumPrice;

    @Override
    public String toString() {
        return "Shopcar{" +
                "shopcarId=" + shopcarId +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", goodsNum=" + goodsNum +
                ", state=" + state +
                ", goods=" + goods +
                ", imgs=" + imgs +
                ", sumPrice=" + sumPrice +
                '}';
    }

    public Integer getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Integer sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public List<Img> getImgs() {
        return imgs;
    }

    public void setImgs(List<Img> imgs) {
        this.imgs = imgs;
    }

    public Integer getShopcarId() {
        return shopcarId;
    }

    public void setShopcarId(Integer shopcarId) {
        this.shopcarId = shopcarId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}