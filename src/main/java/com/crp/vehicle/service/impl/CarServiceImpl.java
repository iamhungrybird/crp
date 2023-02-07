package com.crp.vehicle.service.impl;

import com.crp.vehicle.entity.Car;
import com.crp.vehicle.dao.CarDao;
import com.crp.vehicle.service.CarService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Car)表服务实现类
 *
 * @author wxx
 * @since 2023-01-28 15:25:31
 */
@Service("carService")
public class CarServiceImpl implements CarService {
    @Resource
    private CarDao carDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public Car queryById(Integer cid) {
        return this.carDao.queryById(cid);
    }

    /**
     * 分页查询
     *
     * @param car         筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Car> queryByPage(Car car, PageRequest pageRequest) {
        long total = this.carDao.count(car);
        return new PageImpl<>(this.carDao.queryAllByLimit(car, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    @Override
    public Car insert(Car car) {
        this.carDao.insert(car);
        return car;
    }

    /**
     * 修改数据
     *
     * @param car 实例对象
     * @return 实例对象
     */
    @Override
    public Car update(Car car) {
        this.carDao.update(car);
        return this.queryById(car.getCid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cid) {
        return this.carDao.deleteById(cid) > 0;
    }
}
