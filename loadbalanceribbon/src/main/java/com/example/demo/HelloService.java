package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 刘亚斌 on 2018/6/12.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String Hello(String name){

        return restTemplate.getForObject("http://NAMESERVICE/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi,"+name+", Sorry,error";
    }
}
