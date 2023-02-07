package com.crp.vehicle.controller;

import com.crp.vehicle.entity.Driver;
import com.crp.vehicle.service.DriverService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * (Driver)表控制层
 *
 * @author wxx
 * @since 2023-01-28 15:25:31
 */
@Api(tags = "")
@RestController
@RequestMapping("driver")
public class DriverController {
    /**
     * 服务对象
     */
    @Resource
    private DriverService driverService;

    /**
     * 分页查询
     *
     * @param driver      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Driver>> queryByPage(Driver driver, PageRequest pageRequest) {
        return ResponseEntity.ok(this.driverService.queryByPage(driver, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Driver> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.driverService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param driver 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Driver> add(Driver driver) {
        return ResponseEntity.ok(this.driverService.insert(driver));
    }

    /**
     * 编辑数据
     *
     * @param driver 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Driver> edit(Driver driver) {
        return ResponseEntity.ok(this.driverService.update(driver));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.driverService.deleteById(id));
    }

}

