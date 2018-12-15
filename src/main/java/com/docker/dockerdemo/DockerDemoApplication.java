package com.docker.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DockerDemoApplication {
    @GetMapping("/test")
    public Map<String,String> getMap(){
        Map<String,String> map =new HashMap<>();
        map.put("test","测试docker打包镜像");
        return map;
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }



}
