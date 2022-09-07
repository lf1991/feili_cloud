package com.feilis.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author feilis
 * @Date 2022/9/6 0:09
 */
@RestController
@RequestMapping("test")
public class TestController {


    @GetMapping("test")
    public String test() {
        return "success";
    }
}
