package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*@Controller
public class HelloWorld {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Hello I Am Kitty";
    }
}*/
//等效
/*@RestController
public class HelloWorld {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello I Am Kitty";
    }
}*/
//等效 窄化请求 区分大小写
@RestController
//@RequestMapping("/user")
public class HelloWorld {
    //@GetMapping("/hello")
    @GetMapping(value = {"/hello","/hi"})
    public String hello(){
        return "Hello I Am Kitty";
    }
}
