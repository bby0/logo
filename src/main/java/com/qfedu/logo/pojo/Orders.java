package com.qfedu.logo.pojo;

import java.util.Date;

public class Orders {
    private Integer oid;

    private String allprice;

    private Date time;

    private Integer state;

    private String orderAdderss;

    private Integer userId;
    
    private OrderLine orderLine;
    
    private Goods goods;
    
    private Img img;
    
    public OrderLine getOrderLine() {
        return orderLine;
    }
    
    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
    
    public Goods getGoods() {
        return goods;
    }
    
    public void setGoods(Goods goods) {
        this.goods = goods;
    }
    
    public Img getImg() {
        return img;
    }
    
    public void setImg(Img img) {
        this.img = img;
    }
    
    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getAllprice() {
        return allprice;
    }

    public void setAllprice(String allprice) {
        this.allprice = allprice == null ? null : allprice.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getOrderAdderss() {
        return orderAdderss;
    }

    public void setOrderAdderss(String orderAdderss) {
        this.orderAdderss = orderAdderss == null ? null : orderAdderss.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", allprice='" + allprice + '\'' +
                ", time=" + time +
                ", state=" + state +
                ", orderAdderss='" + orderAdderss + '\'' +
                ", userId=" + userId +
                '}';
    }
}