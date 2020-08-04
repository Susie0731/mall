package com.example.mall.service;

import com.example.mall.dao.SysUserMapper;
import com.example.mall.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser selectById(Integer id) {
        return userMapper. selectByPrimaryKey(id);
    }

    public SysUser selectByName(String name) {
        return userMapper.selectByName(name);
    }
}

