package com.example.mall.dao;

import com.example.mall.entity.SysUserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated
     */
    List<SysUserRole> selectAll();

    List<SysUserRole> listByUserId(Integer id);
}