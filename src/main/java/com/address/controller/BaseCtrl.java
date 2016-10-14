package com.address.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 1004w455 on 2016. 10. 14..
 */
@RestController
public class BaseCtrl {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

}
