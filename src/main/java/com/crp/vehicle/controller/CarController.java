package com.crp.vehicle.controller;

import com.crp.vehicle.entity.Car;
import com.crp.vehicle.service.CarService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * (Car)表控制层
 *
 * @author wxx
 * @since 2023-01-28 15:25:31
 */
@Api(tags = "")
@RestController
@RequestMapping("car")
public class CarController {
    /**
     * 服务对象
     */
    @Resource
    private CarService carService;

    /**
     * 分页查询
     *
     * @param car         筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Car>> queryByPage(Car car, PageRequest pageRequest) {
        return ResponseEntity.ok(this.carService.queryByPage(car, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Car> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.carService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param car 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Car> add(Car car) {
        return ResponseEntity.ok(this.carService.insert(car));
    }

    /**
     * 编辑数据
     *
     * @param car 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Car> edit(Car car) {
        return ResponseEntity.ok(this.carService.update(car));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.carService.deleteById(id));
    }

}

