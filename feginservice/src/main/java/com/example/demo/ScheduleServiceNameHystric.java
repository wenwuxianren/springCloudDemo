package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 刘亚斌 on 2018/7/2.
 */
@Component
public class ScheduleServiceNameHystric implements ScheduleService {
    @Override
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Sorry " + name;
    }
}
