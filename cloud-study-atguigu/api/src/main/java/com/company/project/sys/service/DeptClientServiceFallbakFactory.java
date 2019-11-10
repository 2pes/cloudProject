package com.company.project.sys.service;

import com.company.project.sys.model.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Chen
 * @created 2019-11-09-19:31.
 */
@Component
public class DeptClientServiceFallbakFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {


        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDept_no(id).setDept_name("该ID："+id+"没有对应的信息，null--降级服务开启").setDb_source("no this database in MYSQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
