package com.company.project.sys.web;

import com.company.project.sys.service.DeptClientService;
import com.company.project.sys.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Chen
 * @created 2019-11-08-0:13.
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;



    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept){
        return this.service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return this.service.list();
    }

}
