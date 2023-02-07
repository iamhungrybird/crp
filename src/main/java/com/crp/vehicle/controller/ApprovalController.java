package com.crp.vehicle.controller;

import com.crp.vehicle.entity.Approval;
import com.crp.vehicle.service.ApprovalService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * (Approval)表控制层
 *
 * @author wxx
 * @since 2023-01-28 15:25:30
 */
@Api(tags = "")
@RestController
@RequestMapping("approval")
public class ApprovalController {
    /**
     * 服务对象
     */
    @Resource
    private ApprovalService approvalService;

    /**
     * 分页查询
     *
     * @param approval    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Approval>> queryByPage(Approval approval, PageRequest pageRequest) {
        return ResponseEntity.ok(this.approvalService.queryByPage(approval, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Approval> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.approvalService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param approval 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Approval> add(Approval approval) {
        return ResponseEntity.ok(this.approvalService.insert(approval));
    }

    /**
     * 编辑数据
     *
     * @param approval 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Approval> edit(Approval approval) {
        return ResponseEntity.ok(this.approvalService.update(approval));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.approvalService.deleteById(id));
    }

}

