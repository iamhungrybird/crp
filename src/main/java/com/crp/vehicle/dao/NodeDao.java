package com.crp.vehicle.dao;

import com.crp.vehicle.entity.Node;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Node)表数据库访问层
 *
 * @author wxx
 * @since 2023-01-28 15:25:32
 */
public interface NodeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param nid 主键
     * @return 实例对象
     */
    Node queryById(Integer nid);

    /**
     * 查询指定行数据
     *
     * @param node     查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Node> queryAllByLimit(Node node, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param node 查询条件
     * @return 总行数
     */
    long count(Node node);

    /**
     * 新增数据
     *
     * @param node 实例对象
     * @return 影响行数
     */
    int insert(Node node);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Node> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Node> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Node> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Node> entities);

    /**
     * 修改数据
     *
     * @param node 实例对象
     * @return 影响行数
     */
    int update(Node node);

    /**
     * 通过主键删除数据
     *
     * @param nid 主键
     * @return 影响行数
     */
    int deleteById(Integer nid);

}

