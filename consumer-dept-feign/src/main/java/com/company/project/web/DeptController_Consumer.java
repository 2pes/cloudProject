package com.company.project.web;

import com.company.project.service.DeptClientService;
import com.company.project.sys.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Chen
 * @created 2019-11-08-0:13.
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/add")
    public String add(Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public String get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public String list() {
        return service.list();
    }

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery() {
        return service.discovery();
    }
}
