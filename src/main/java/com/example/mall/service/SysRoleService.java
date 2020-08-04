package com.example.mall.service;

import com.example.mall.dao.SysRoleMapper;
import com.example.mall.entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectByPrimaryKey(id);
    }
}
