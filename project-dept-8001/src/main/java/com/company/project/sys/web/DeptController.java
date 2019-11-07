package com.company.project.sys.web;

import com.company.project.sys.model.Dept;
import com.company.project.sys.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Chen
 * @created 2019-11-07-23:07.
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept deptEntity) {
        return deptService.addDept(deptEntity);
    }

    @RequestMapping(value = "/dept/findById/{deptNo}", method = RequestMethod.GET)
    public Dept findById(@PathVariable("deptNo") Long deptNo) {
        return deptService.findById(deptNo);
    }

    @RequestMapping(value = "/dept/findAll", method = RequestMethod.GET)
    public List<Dept> findAll() {
        List<Dept> all = deptService.findAll();
        return all;
    }


}