package com.szgwnet.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szgwnet.demo.Mapper.UserMapper;
import com.szgwnet.demo.bean.User;
@Service
public class UserDao {
	@Autowired
    private UserMapper userMapper;
    
    
    public User findAllUser(String id) {
    	User list = userMapper.getById(id);
        return list;
    }
    
    
    public User findAllUser2(String id) {
    	User list = userMapper.getById(id);
        return list;
    }
    
    
    public User findAllUser3(String id) {
    	User list = userMapper.getById(id);
        return list;
    }
}
