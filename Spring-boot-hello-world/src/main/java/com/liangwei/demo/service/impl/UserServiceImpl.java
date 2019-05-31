package com.liangwei.demo.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.liangwei.demo.mapper.UserMapper;
import com.liangwei.demo.model.BTranscation;
import com.liangwei.demo.model.Block;
import com.liangwei.demo.model.User;
import com.liangwei.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<BTranscation> getUser() {
        List<BTranscation> userList = userMapper.getUser();

        // lamdba表达式的使用

        // List<User> userListOrderBy= userList.stream().filter((User u) -> u.getName() == "1212").collect(Collectors.toList());

        //Collections.sort(userList,(user1, user2) -> user1.getNo() - user2.getNo());

        return userList;
    }
    @Override
    public List<Block> getNewBlock(){
        List<Block> userList = userMapper.getNewBlock();

        return userList;
    }
}
