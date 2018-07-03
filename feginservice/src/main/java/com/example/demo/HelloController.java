package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 刘亚斌 on 2018/6/13.
 */
@RestController
public class HelloController {
    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(String name){
        return scheduleService.sayHello(name);
    }
}
