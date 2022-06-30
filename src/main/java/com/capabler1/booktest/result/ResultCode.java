package com.capabler1.booktest.result;

/**
 * @author capabler1
 * @version 1.0
 * @date 2022/6/28 22:22
 */
public enum ResultCode {
    SUCCESS(200),
    FAIL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
