package com.crp.vehicle.dao;

import com.crp.vehicle.entity.Driver;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Driver)表数据库访问层
 *
 * @author wxx
 * @since 2023-01-28 15:25:31
 */
public interface DriverDao {

    /**
     * 通过ID查询单条数据
     *
     * @param driveruserid 主键
     * @return 实例对象
     */
    Driver queryById(String driveruserid);

    /**
     * 查询指定行数据
     *
     * @param driver   查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Driver> queryAllByLimit(Driver driver, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param driver 查询条件
     * @return 总行数
     */
    long count(Driver driver);

    /**
     * 新增数据
     *
     * @param driver 实例对象
     * @return 影响行数
     */
    int insert(Driver driver);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Driver> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Driver> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Driver> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Driver> entities);

    /**
     * 修改数据
     *
     * @param driver 实例对象
     * @return 影响行数
     */
    int update(Driver driver);

    /**
     * 通过主键删除数据
     *
     * @param driveruserid 主键
     * @return 影响行数
     */
    int deleteById(String driveruserid);

}

