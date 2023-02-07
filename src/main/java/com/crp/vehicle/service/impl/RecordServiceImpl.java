package com.crp.vehicle.service.impl;

import com.crp.vehicle.entity.Record;
import com.crp.vehicle.dao.RecordDao;
import com.crp.vehicle.service.RecordService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Record)表服务实现类
 *
 * @author wxx
 * @since 2023-01-28 15:25:32
 */
@Service("recordService")
public class RecordServiceImpl implements RecordService {
    @Resource
    private RecordDao recordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    @Override
    public Record queryById(Integer rid) {
        return this.recordDao.queryById(rid);
    }

    /**
     * 分页查询
     *
     * @param record      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Record> queryByPage(Record record, PageRequest pageRequest) {
        long total = this.recordDao.count(record);
        return new PageImpl<>(this.recordDao.queryAllByLimit(record, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param record 实例对象
     * @return 实例对象
     */
    @Override
    public Record insert(Record record) {
        this.recordDao.insert(record);
        return record;
    }

    /**
     * 修改数据
     *
     * @param record 实例对象
     * @return 实例对象
     */
    @Override
    public Record update(Record record) {
        this.recordDao.update(record);
        return this.queryById(record.getRid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rid) {
        return this.recordDao.deleteById(rid) > 0;
    }
}
