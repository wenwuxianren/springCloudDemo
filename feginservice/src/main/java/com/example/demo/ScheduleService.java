package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 刘亚斌 on 2018/6/13.
 */
@FeignClient(value = "nameService",fallback = ScheduleServiceNameHystric.class)
public interface ScheduleService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}
