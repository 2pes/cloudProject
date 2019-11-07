package com.company.project.sys.service.impl;

import com.company.project.sys.dao.DeptDao;
import com.company.project.sys.model.Dept;
import com.company.project.sys.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chen
 * @created 2019-11-07-23:03.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public boolean addDept(Dept deptEntity) {
        return deptDao.addDept(deptEntity);
    }

    @Override
    public Dept findById(Long deptNo) {
        return deptDao.findById(deptNo);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
