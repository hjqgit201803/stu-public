package com.hjq.stupublic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hejianqing
 * @date 2019/12/7
 */

@RestController
@RequestMapping(value = "/res")
public class RebaseController {


    public void testRebase(){
        System.out.println("this is hejianqing code");
        System.out.println("this is hejianqing second add code");
        System.out.println("this is jg code");
        System.out.println("this is hejianqing add code");
    }

    public void testRebase1(){
        System.out.println("this is should first  update by jg");
        System.out.println("this is jg add code");
        System.out.println("this is hejianqing add code");
    }





}
