package com.company.project.sys.dao;

import com.company.project.sys.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Chen
 * @created 2019-11-07-22:32.
 */
@Mapper
public interface DeptDao {

    /**
     * 插入
     * @param deptEntity
     *
     * @return
     */
    boolean addDept(Dept deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    Dept findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<Dept> findAll();
}
