package com.crp.common.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @Desc:
 * @Author 吴想想
 * @Date 2023/1/28
 */
@Data
@ApiModel("分页对象")
public class PageVo {

    private Integer pageNum;
    private Integer pageSize;
}
