package com.qfedu.logo.service;

import com.qfedu.logo.pojo.AddressDetail;

import java.util.List;

public interface AddressService {
	
	List<AddressDetail> getAddress(String userId);
}
