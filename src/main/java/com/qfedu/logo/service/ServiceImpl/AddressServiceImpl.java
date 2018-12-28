package com.qfedu.logo.service.ServiceImpl;

import com.qfedu.logo.mapper.AddressDetailMapper;
import com.qfedu.logo.pojo.AddressDetail;
import com.qfedu.logo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDetailMapper addressDetailMapper;

	@Override
	public List<AddressDetail> getAddress(String userId) {
		return addressDetailMapper.selectAddressByUserid(Integer.parseInt(userId));
	}
}
