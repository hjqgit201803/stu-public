package com.hjq.stupublic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hejianqing
 * @date 2019/12/6
 */
@RestController
@RequestMapping(value = "/test")
public class testController {

    @GetMapping(value = "/commit")
    public void testGitCommit(){
        System.out.println("this is nothing hhaha");
        System.out.println("this is hjq add hahha");

        System.out.println("this is hjq add code");
    }

}
