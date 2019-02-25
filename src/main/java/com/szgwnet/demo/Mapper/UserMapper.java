package com.szgwnet.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.szgwnet.demo.bean.User;

@Mapper
public interface UserMapper {
	public User getById(String id);
}
