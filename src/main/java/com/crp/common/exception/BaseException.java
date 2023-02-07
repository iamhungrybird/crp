package com.crp.common.exception;

import com.crp.common.api.IResultCode;

/**
 * @Desc: 自定义API异常
 * @Author 吴想想
 * @Date 2023/1/12
 */
public class BaseException extends RuntimeException {
    private IResultCode errorCode;

    public BaseException(IResultCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public IResultCode getErrorCode() {
        return errorCode;
    }
}
