package com.crp.vehicle.service;

import com.crp.vehicle.entity.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Record)表服务接口
 *
 * @author wxx
 * @since 2023-01-28 15:25:32
 */
public interface RecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    Record queryById(Integer rid);

    /**
     * 分页查询
     *
     * @param record      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Record> queryByPage(Record record, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param record 实例对象
     * @return 实例对象
     */
    Record insert(Record record);

    /**
     * 修改数据
     *
     * @param record 实例对象
     * @return 实例对象
     */
    Record update(Record record);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rid);

}
