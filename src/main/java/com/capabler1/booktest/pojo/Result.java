package com.capabler1.booktest.pojo;

/**
 * @author capabler1
 * @version 1.0
 * @date 2022/6/27 11:15
 */
public class Result {
    //响应码
    private int code;

    public Result(int code) {
        this.code = code;
    }

    public Result(int resultCode, String message, Object data) {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
