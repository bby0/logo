package com.qfedu.logo.controller;

import com.qfedu.logo.pojo.AddressDetail;
import com.qfedu.logo.pojo.Orders;
import com.qfedu.logo.service.WWWOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WWWOrderController {

    @Autowired
    private WWWOrderService wwwOrderService;

    @GetMapping("/getOrders1")
    public List<Orders> wselectOrderByUidAndGids(Integer userId, String[] shopcarIds) {
        System.out.println("shopcarIds"+userId);
        for (int i = 0; i < shopcarIds.length; i++) {
            System.out.println("shopcarIds"+shopcarIds[i]);
        }
        List<Orders> orders = wwwOrderService.wselectOrderByUidAndGids(userId, shopcarIds);
       // System.out.println(orders.isEmpty());
        System.out.println("Oeders");
        return orders;
    }

    @GetMapping("/getAddress")
    public List<AddressDetail> wselectUAddress(Integer userId) {
       return wwwOrderService.wselectUAddress(userId);
    }
}
