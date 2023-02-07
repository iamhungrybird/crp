package com.crp.vehicle.service;

import com.crp.vehicle.entity.Approval;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Approval)表服务接口
 *
 * @author wxx
 * @since 2023-01-28 15:25:30
 */
public interface ApprovalService {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    Approval queryById(Integer aid);

    /**
     * 分页查询
     *
     * @param approval    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Approval> queryByPage(Approval approval, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param approval 实例对象
     * @return 实例对象
     */
    Approval insert(Approval approval);

    /**
     * 修改数据
     *
     * @param approval 实例对象
     * @return 实例对象
     */
    Approval update(Approval approval);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer aid);

}
