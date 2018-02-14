package com.jxxy.ds.sys.util.normal;


public class ReturnInfoHelper {
    private String msg;

    private short code;

    private Object data;

    public ReturnInfoHelper() {
        this.msg = "获取成功";
        this.code = 1;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
