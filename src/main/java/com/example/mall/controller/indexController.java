package com.example.mall.controller;

import com.example.mall.dao.UserInfoMapper;
import com.example.mall.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class indexController {
    @Autowired
    private UserInfoMapper userInfoMapper;


    @RequestMapping(path={"/index","/"})
    public List<UserInfo> selectTest(){
        return userInfoMapper.selectAll();
    }
}