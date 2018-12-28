package com.qfedu.logo.service;

import com.qfedu.logo.pojo.OrderLine;
import com.qfedu.logo.pojo.Orders;

import java.util.List;
import java.util.Map;

public interface OrdersService {
	
	List<Orders> getOrdersByUserId(Integer userId);
	
	int insertOrdersBySid(Integer userId,String allprice,Integer aId,Integer[] shopcarIds);
	
	int insertOrdersByGid(Integer userId,String allprice,Integer aId,Integer goodsId,Integer goodsNum);
	
	List<Orders> selectOrders(int userId,int state);
}
