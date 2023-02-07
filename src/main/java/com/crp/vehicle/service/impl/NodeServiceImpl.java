package com.crp.vehicle.service.impl;

import com.crp.vehicle.entity.Node;
import com.crp.vehicle.dao.NodeDao;
import com.crp.vehicle.service.NodeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Node)表服务实现类
 *
 * @author wxx
 * @since 2023-01-28 15:25:32
 */
@Service("nodeService")
public class NodeServiceImpl implements NodeService {
    @Resource
    private NodeDao nodeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param nid 主键
     * @return 实例对象
     */
    @Override
    public Node queryById(Integer nid) {
        return this.nodeDao.queryById(nid);
    }

    /**
     * 分页查询
     *
     * @param node        筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Node> queryByPage(Node node, PageRequest pageRequest) {
        long total = this.nodeDao.count(node);
        return new PageImpl<>(this.nodeDao.queryAllByLimit(node, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param node 实例对象
     * @return 实例对象
     */
    @Override
    public Node insert(Node node) {
        this.nodeDao.insert(node);
        return node;
    }

    /**
     * 修改数据
     *
     * @param node 实例对象
     * @return 实例对象
     */
    @Override
    public Node update(Node node) {
        this.nodeDao.update(node);
        return this.queryById(node.getNid());
    }

    /**
     * 通过主键删除数据
     *
     * @param nid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer nid) {
        return this.nodeDao.deleteById(nid) > 0;
    }
}
