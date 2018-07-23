package com.qfedu.common.vo;

/**
 *@Author feri
 *@Date Created in 2018/7/23 15:26
 */
public class R {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R() {
    }
    public static R setOK(String msg){
        return new R(1000,msg,null);
    }
    public static R setError(String msg){
        return new R(2000,msg,null);
    }
}
