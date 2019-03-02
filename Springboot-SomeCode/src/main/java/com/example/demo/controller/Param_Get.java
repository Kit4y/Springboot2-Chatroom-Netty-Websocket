package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param")
public class Param_Get {

    @GetMapping("/{id}")
    public String hello(@PathVariable("id") String id){
        return "Id: "+id;
    }

    // http://localhost:8080/param/hello/kitty
    @GetMapping("/hello/{name}")
    public String haha(@PathVariable("name") String name1){ //name1只形式参数
        return "Hello your name is : "+name1;
    }
    // http://localhost:8080/param/hia?name=kitty
    @GetMapping("/hia")
    public String hia(@RequestParam("name") String name){
        return "Hello your name is : "+name;
    }

    //形参实参一致,与上请求一致
    @GetMapping("/hia1")
    public String hia1(String name){
        return "Hello your name is : "+name;
    }

    //添加默认值
    // http://localhost:8080/param/hia2
    @GetMapping("/hia2")
    public String hia2(@RequestParam(value = "name",defaultValue = "default Name")String name){
        return "Hello your name is : "+name;
    }

    //非必需
    @GetMapping("/hia3")
    public String hia3(@RequestParam(value = "name",required = false)String name){
        return "Hello your name is : "+name;
    }
}
