package com.company.project.service;

import com.company.project.sys.model.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Chen
 * @created 2019-11-08-22:15.
 */
@FeignClient(value = "PROVIDER-DEPT")
public interface DeptClientService
{
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public String list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public String add(Dept dept);

    @RequestMapping(value = "/dept/discovery")
    public Object discovery();
}