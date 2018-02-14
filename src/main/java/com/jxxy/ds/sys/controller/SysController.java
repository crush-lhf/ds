package com.jxxy.ds.sys.controller;

import com.jxxy.ds.sys.service.SysService;
import com.jxxy.ds.sys.util.normal.ReturnInfoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
@RequestMapping("/sys")
public class SysController {
    @Autowired
    private SysService sysService;

    /**
     * 测试用
     *
     * @param userId
     * @return
     */
    @RequestMapping("/getUser.do")
    @ResponseBody
    public ReturnInfoHelper getUser(String userId) {
        ReturnInfoHelper info = new ReturnInfoHelper();
        try {
            info.setData(this.sysService.queryUser(userId));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return info;
    }
}
