package com.qfedu.logo.controller;

import com.qfedu.logo.pojo.AddressDetail;
import com.qfedu.logo.service.AddressService;
import com.qfedu.logo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(path = "/getAddress1",method = RequestMethod.GET)
	public R<AddressDetail> getAddress(String userId){
		R r = new  R<AddressDetail>();
		r.setData(addressService.getAddress(userId));
		//System.out.println(userId);
		return r;
	}
}
