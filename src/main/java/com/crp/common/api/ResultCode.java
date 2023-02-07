package com.crp.common.api;

/**
 * @Desc:
 * @Author 吴想想
 * @Date 2023/1/12
 */
public enum ResultCode implements IResultCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private int code;
    private String message;

    ResultCode(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    /**
     * 返回码
     *
     * @return
     */
    @Override
    public int getCode() {
        return code;
    }

    /**
     * 返回信息
     *
     * @return
     */
    @Override
    public String getMessage() {
        return message;
    }
}
