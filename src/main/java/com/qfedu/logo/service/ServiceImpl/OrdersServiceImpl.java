package com.qfedu.logo.service.ServiceImpl;

import com.qfedu.logo.mapper.AddressDetailMapper;
import com.qfedu.logo.mapper.OrderLineMapper;
import com.qfedu.logo.mapper.OrdersMapper;
import com.qfedu.logo.mapper.ShopcarMapper;
import com.qfedu.logo.pojo.AddressDetail;
import com.qfedu.logo.pojo.OrderLine;
import com.qfedu.logo.pojo.Orders;
import com.qfedu.logo.pojo.Shopcar;
import com.qfedu.logo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

@Service

public class OrdersServiceImpl implements OrdersService {
	
	
	@Autowired
	private OrdersMapper ordersMapper;
	
	@Autowired
	private OrderLineMapper orderLineMapper;
	
	@Autowired
	private AddressDetailMapper addressDetailMapper;
	
	@Autowired
	private ShopcarMapper shopcarMapper;
	
	@Override
	public List<Orders> getOrdersByUserId(Integer userId) {
		return ordersMapper.selectByUserId(userId);
	}
	
	@Override
	public int insertOrdersBySid(Integer userId,String allprice,Integer aId,Integer[] shopcarIds) {
		//int i = ordersMapper.insert(orders);
		//System.out.println(orders.getOid());
		//orderLine.setOrderId(orders.getOid());
		//int j = orderLineMapper.insert(orderLine);
		AddressDetail addressDetail = addressDetailMapper.selectByPrimaryKey(aId);
		String address = addressDetail.getAddress();
		
		Orders orders =new Orders();
		orders.setAllprice(allprice);
		orders.setState(1);
		orders.setOrderAdderss(address);
		orders.setUserId(userId);
		int i = ordersMapper.insert(orders);
		Integer OrderId = orders.getOid();
		System.out.println(OrderId);
		for (Integer shopcarId : shopcarIds) {
			Shopcar shopcar= shopcarMapper.selectByPrimaryKey(shopcarId);
			Integer goodsNum = shopcar.getGoodsNum();
			Integer goodsId = shopcar.getGoodsId();
			OrderLine orderLine = new OrderLine();
			orderLine.setGoodsId(goodsId);
			orderLine.setGoodsNum(goodsNum);
			orderLine.setOrderId(OrderId);
			//ordersService.insertOrders(orders,orderLine);
			orderLineMapper.insert(orderLine);
		}
		return i;
	}
	
	@Override
	public int insertOrdersByGid(Integer userId, String allprice, Integer aId, Integer goodsId, Integer goodsNum) {
		AddressDetail addressDetail = addressDetailMapper.selectByPrimaryKey(aId);
		String address = addressDetail.getAddress();
		
		Orders orders =new Orders();
		orders.setAllprice(allprice);
		orders.setState(1);
		orders.setOrderAdderss(address);
		orders.setUserId(userId);
		ordersMapper.insert(orders);
		Integer OrderId = orders.getOid();
		
		OrderLine orderLine = new OrderLine();
		orderLine.setGoodsId(goodsId);
		orderLine.setGoodsNum(goodsNum);
		orderLine.setOrderId(OrderId);
		int i =orderLineMapper.insert(orderLine);
		return 	i;
	}
	
	@Override
	public List<Orders> selectOrders(int userId, int state) {
		return ordersMapper.selectOrders(userId,state);
	}
}
