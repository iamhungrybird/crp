package com.crp.vehicle.dao;

import com.crp.vehicle.entity.Approval;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Approval)表数据库访问层
 *
 * @author wxx
 * @since 2023-01-28 15:25:30
 */
public interface ApprovalDao {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    Approval queryById(Integer aid);

    /**
     * 查询指定行数据
     *
     * @param approval 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Approval> queryAllByLimit(Approval approval, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param approval 查询条件
     * @return 总行数
     */
    long count(Approval approval);

    /**
     * 新增数据
     *
     * @param approval 实例对象
     * @return 影响行数
     */
    int insert(Approval approval);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Approval> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Approval> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Approval> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Approval> entities);

    /**
     * 修改数据
     *
     * @param approval 实例对象
     * @return 影响行数
     */
    int update(Approval approval);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 影响行数
     */
    int deleteById(Integer aid);

}

