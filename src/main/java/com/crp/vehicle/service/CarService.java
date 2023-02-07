package com.crp.vehicle.service;

import com.crp.vehicle.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Car)表服务接口
 *
 * @author wxx
 * @since 2023-01-28 15:25:31
 */
public interface CarService {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Car queryById(Integer cid);

    /**
     * 分页查询
     *
     * @param car         筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Car> queryByPage(Car car, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    Car insert(Car car);

    /**
     * 修改数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    Car update(Car car);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cid);

}
