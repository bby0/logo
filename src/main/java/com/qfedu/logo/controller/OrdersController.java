package com.qfedu.logo.controller;

import com.qfedu.logo.mapper.AddressDetailMapper;
import com.qfedu.logo.mapper.OrderLineMapper;
import com.qfedu.logo.mapper.ShopcarMapper;
import com.qfedu.logo.pojo.AddressDetail;
import com.qfedu.logo.pojo.OrderLine;
import com.qfedu.logo.pojo.Orders;
import com.qfedu.logo.pojo.Shopcar;
import com.qfedu.logo.service.AddressService;
import com.qfedu.logo.service.OrdersService;
import com.qfedu.logo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	

	
	@RequestMapping(path = "/getOrders",method = RequestMethod.GET)
	public R<AddressDetail> getAddress(Integer userId){
		R r = new  R<AddressDetail>();
		r.setData(ordersService.getOrdersByUserId(userId));
		//System.out.println(userId);
		return r;
	}
	
	@RequestMapping(path = "/insertOrdersBySid",method = RequestMethod.POST)
	public int insertOrder(Integer userId,String allprice,Integer aId,Integer[] shopcarIds){
		
		return ordersService.insertOrdersBySid(userId,allprice,aId,shopcarIds);
	}
	
	@RequestMapping(path = "/insertOrdersByGid",method = RequestMethod.POST)
	public int insertOrdersByGid(Integer userId,String allprice,Integer aId,Integer goodsId,Integer goodsNum){
		return ordersService.insertOrdersByGid(userId,allprice,aId,goodsId,goodsNum);
		
	}
	
	@RequestMapping(path = "/getOrdersByUserIdAndState",method = RequestMethod.GET)
	public List<Orders> getOrdersByUserIdAndState(Integer userId, Integer state){
		
		//System.out.println(userId);
		//System.out.println(state);
		
		return ordersService.selectOrders(userId,state);
	}
}
