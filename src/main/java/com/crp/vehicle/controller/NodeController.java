package com.crp.vehicle.controller;

import com.crp.vehicle.entity.Node;
import com.crp.vehicle.service.NodeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * (Node)表控制层
 *
 * @author wxx
 * @since 2023-01-28 15:25:32
 */
@Api(tags = "")
@RestController
@RequestMapping("node")
public class NodeController {
    /**
     * 服务对象
     */
    @Resource
    private NodeService nodeService;

    /**
     * 分页查询
     *
     * @param node        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Node>> queryByPage(Node node, PageRequest pageRequest) {
        return ResponseEntity.ok(this.nodeService.queryByPage(node, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Node> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.nodeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param node 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Node> add(Node node) {
        return ResponseEntity.ok(this.nodeService.insert(node));
    }

    /**
     * 编辑数据
     *
     * @param node 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Node> edit(Node node) {
        return ResponseEntity.ok(this.nodeService.update(node));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.nodeService.deleteById(id));
    }

}

