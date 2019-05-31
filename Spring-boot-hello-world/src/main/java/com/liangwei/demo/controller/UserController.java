package com.liangwei.demo.controller;

import com.liangwei.demo.model.BTranscation;
import com.liangwei.demo.model.Block;
import com.liangwei.demo.model.User;
import com.liangwei.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public List<BTranscation> UserQry() {
        return userService.getUser();
    }

    @RequestMapping(value ="/user/new", method = RequestMethod.GET)
    public List<Block> NewBlock() {
        return userService.getNewBlock();
    }
    /*
    @RequestMapping(value ="/user", method = RequestMethod.POST)
    public void UserAdd(User user){
         userService.AddUser(user);
    }

    @RequestMapping(value ="/user", method = RequestMethod.PUT)
    public void UserUpdate(User user){
        userService.updateUserByNo(user);
    }

    @RequestMapping(value ="/user", method = RequestMethod.DELETE)
    public void UserDel(@RequestParam(value="no") int no){
        userService.delUserById(no);
    }*/
}
