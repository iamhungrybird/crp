package com.crp.vehicle.service.impl;

import com.crp.vehicle.entity.Approval;
import com.crp.vehicle.dao.ApprovalDao;
import com.crp.vehicle.service.ApprovalService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Approval)表服务实现类
 *
 * @author wxx
 * @since 2023-01-28 15:25:30
 */
@Service("approvalService")
public class ApprovalServiceImpl implements ApprovalService {
    @Resource
    private ApprovalDao approvalDao;

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    @Override
    public Approval queryById(Integer aid) {
        return this.approvalDao.queryById(aid);
    }

    /**
     * 分页查询
     *
     * @param approval    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Approval> queryByPage(Approval approval, PageRequest pageRequest) {
        long total = this.approvalDao.count(approval);
        return new PageImpl<>(this.approvalDao.queryAllByLimit(approval, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param approval 实例对象
     * @return 实例对象
     */
    @Override
    public Approval insert(Approval approval) {
        this.approvalDao.insert(approval);
        return approval;
    }

    /**
     * 修改数据
     *
     * @param approval 实例对象
     * @return 实例对象
     */
    @Override
    public Approval update(Approval approval) {
        this.approvalDao.update(approval);
        return this.queryById(approval.getAid());
    }

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer aid) {
        return this.approvalDao.deleteById(aid) > 0;
    }
}
