package com.company.project.sys.service;

import com.company.project.sys.model.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Chen
 * @created 2019-11-08-22:15.
 */
//@FeignClient(value = "PROVIDER-DEPT" )
@FeignClient(value = "PROVIDER-DEPT" ,fallbackFactory = DeptClientServiceFallbakFactory.class)
public interface DeptClientService
{
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept);

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();
}