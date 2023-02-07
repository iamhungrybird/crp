package com.crp.common.exception;

import com.crp.common.api.IResultCode;

/**
 * @Desc: 断言处理类，用于抛出各种BaseException异常
 * @Author 吴想想
 * @Date 2023/1/12
 */
public class Asserts {
    public static void fail(String message) {
        throw new BaseException(message);
    }

    public static void fail(IResultCode errorCode) {
        throw new BaseException(errorCode);
    }
}
