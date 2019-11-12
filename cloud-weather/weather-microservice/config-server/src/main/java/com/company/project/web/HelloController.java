package com.company.project.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chen
 * @created 2019-11-12-21:01.
 */
@RestController
@RequestMapping("/client")
public class HelloController {
    @GetMapping
    public String hello() {
        return "client-hello";
    }
}
