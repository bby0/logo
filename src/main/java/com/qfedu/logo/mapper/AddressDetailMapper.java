package com.qfedu.logo.mapper;

import com.qfedu.logo.pojo.AddressDetail;

import java.util.List;

public interface AddressDetailMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(AddressDetail record);

    int insertSelective(AddressDetail record);

    AddressDetail selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(AddressDetail record);

    int updateByPrimaryKey(AddressDetail record);
    
    List<AddressDetail> selectAddressByUserid(Integer userId);
    
  //  List<AddressDetail> wselectUAddress(Integer userId);
}