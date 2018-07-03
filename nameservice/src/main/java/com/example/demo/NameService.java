package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 刘亚斌 on 2018/6/12.
 */
@RestController
public class NameService {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public  String say(@RequestParam String name){
        return "hi " + name + ", I am from port: "+ port;
    }
}
