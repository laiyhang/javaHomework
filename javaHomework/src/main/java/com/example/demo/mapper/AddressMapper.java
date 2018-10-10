package com.example.demo.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.Address;
@Mapper
public interface AddressMapper {
	public void addAddr(Address address);
	public Address findById(int id);
	public void deleteById(int id);
	public void updateAddress(Address address);
	
	public void deleteaddressbylist(List<Integer> list);
}
