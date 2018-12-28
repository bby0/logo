package com.qfedu.logo.service.ServiceImpl;

import com.qfedu.logo.mapper.AddressDetailMapper;
import com.qfedu.logo.mapper.OrdersMapper;
import com.qfedu.logo.pojo.AddressDetail;
import com.qfedu.logo.pojo.Orders;
import com.qfedu.logo.service.WWWOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WWWOrderServiceImpl implements WWWOrderService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private AddressDetailMapper addressDetailMapper;

    @Override
    public List<Orders> wselectOrderByUidAndGids(Integer userId, String[] shopcarIds) {
        return null;
    }

    @Override
    public List<AddressDetail> wselectUAddress(Integer userId) {
        return addressDetailMapper.selectAddressByUserid(userId);
    }
}
