package com.company.project.sys.service;

import com.company.project.sys.model.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 插入
     * @param deptEntity
     * @return
     */
    boolean add(Dept deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    Dept get(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<Dept> list();
}
