package com.fish.springbootlearn.Controller;

import org.springframework.web.bind.annotation.*;

/**
 * 演示各种传参形式
 */
@RestController
@RequestMapping("/prefix")//整体加一个前缀
public class ParaController {
    @GetMapping({"/firstrequest"})//http://127.0.0.1:8001/first/prefix/firstrequest
    public String firstRequest(){
        return "第一个接口";//第一个接口
    }

    @GetMapping({"/requestpara"})//http://127.0.0.1:8001/first/prefix/requestpara?num=5
    public String requestpara(@RequestParam Integer num){
        return "para from request: " +num;//para from request: 5
    }

    @GetMapping({"/para/{num}"})//http://127.0.0.1:8001/first/prefix/para/8
    public String pathpara(@PathVariable Integer num){
        return "para from path: " +num;//para from path: 8
    }

    //多url的用法
    @GetMapping({"/multiurl1","/multiurl2"})//http://127.0.0.1:8001/first/prefix/multiurl1?num=8
    public String multiurl(@RequestParam Integer num){
        return "para from request: " +num;//para from request: 8
    }

    @GetMapping({"/required"})//http://127.0.0.1:8001/first/prefix/required
    public String required(@RequestParam(required = false,defaultValue = "0") Integer num){
        return "para from request: " +num;//para from request: 5
    }
}