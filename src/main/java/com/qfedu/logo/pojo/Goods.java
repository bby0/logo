package com.qfedu.logo.pojo;


import java.util.List;

public class Goods {
    private Integer gid;

    private String gname;

    private String price;

    private String descs;

    private Integer typeid;

    private List<Img> img;
    
    private Integer goodsNum;
    
    private Integer goodsId;
    
    private Integer sumPrice;
    
    public Integer getGoodsNum() {
        return goodsNum;
    }
    
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
    
    public Integer getGoodsId() {
        return goodsId;
    }
    
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    
    public Integer getSumPrice() {
        return sumPrice;
    }
    
    public void setSumPrice(Integer sumPrice) {
        this.sumPrice = sumPrice;
    }
    
    public List<Img> getImg() {
        return img;
    }

    public void setImg(List<Img> img) {
        this.img = img;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs == null ? null : descs.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", price='" + price + '\'' +
                ", descs='" + descs + '\'' +
                ", typeid=" + typeid +
                ", img=" + img +
                '}';
    }
}