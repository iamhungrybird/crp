package com.crp.vehicle.service;

import com.crp.vehicle.entity.Node;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Node)表服务接口
 *
 * @author wxx
 * @since 2023-01-28 15:25:32
 */
public interface NodeService {

    /**
     * 通过ID查询单条数据
     *
     * @param nid 主键
     * @return 实例对象
     */
    Node queryById(Integer nid);

    /**
     * 分页查询
     *
     * @param node        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Node> queryByPage(Node node, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param node 实例对象
     * @return 实例对象
     */
    Node insert(Node node);

    /**
     * 修改数据
     *
     * @param node 实例对象
     * @return 实例对象
     */
    Node update(Node node);

    /**
     * 通过主键删除数据
     *
     * @param nid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer nid);

}
