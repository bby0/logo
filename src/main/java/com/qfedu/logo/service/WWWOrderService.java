package com.qfedu.logo.service;

import com.qfedu.logo.pojo.AddressDetail;
import com.qfedu.logo.pojo.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WWWOrderService {
    List<Orders> wselectOrderByUidAndGids(Integer userId, String[] shopcarIds);

    List<AddressDetail> wselectUAddress(Integer userId);

}
