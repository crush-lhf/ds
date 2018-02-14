package com.jxxy.ds.sys.service.Impl;

import com.jxxy.ds.sys.dao.SysDao;
import com.jxxy.ds.sys.model.SysUser;
import com.jxxy.ds.sys.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysServiceImpl implements SysService {
    @Autowired
    private SysDao sysDao;

    @Override
    public SysUser queryUser(String userId) {
        return this.sysDao.queryUserById(userId);
    }
}
