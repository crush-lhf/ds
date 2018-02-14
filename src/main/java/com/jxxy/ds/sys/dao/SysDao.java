package com.jxxy.ds.sys.dao;


import com.jxxy.ds.sys.model.SysUser;
import org.springframework.stereotype.Repository;


public interface SysDao {
    /**
     * 获取用户
     * @param userId
     * @return
     */
    SysUser queryUserById(String userId);
}
