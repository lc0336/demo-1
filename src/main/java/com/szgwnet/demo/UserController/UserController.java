package com.szgwnet.demo.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.szgwnet.demo.bean.User;
import com.szgwnet.demo.dao.UserDao;
@RestController
public class UserController {
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/index/{name}")
    @ResponseBody
    public String index(@PathVariable String name){
        
        if(null==name){
            name="boy";
        }
        
        return "hello world" +name;
    }
	
	
	@RequestMapping("/indexs/{id}")
    @ResponseBody
    public User getById(@PathVariable String id){
        return userDao.findAllUser(id);
    }
	
}
