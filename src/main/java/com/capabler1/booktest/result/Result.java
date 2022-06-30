package com.capabler1.booktest.result;

import lombok.Data;

/**
 * @author capabler1
 * @version 1.0
 * @date 2022/6/28 22:23
 */
@Data
public class Result {
    private int code;
    private String message;
    private Object result;

    Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.result = data;
    }
}
