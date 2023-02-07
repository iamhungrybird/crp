package com.crp.common.api;

/**
 * @Desc: 封装返回码
 * @Author 吴想想
 * @Date 2023/1/12
 */
public interface IResultCode {
    /**
     * 返回码
     *
     * @return
     */
    int getCode();

    /**
     * 返回信息
     *
     * @return
     */

    String getMessage();
}
