package com.example.demo.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class Param_Post {
    @PostMapping("/post")
    public String hello(String name,String age)
    {
        return "Your name: "+name+" age is : "+age;
    }

    @PostMapping("/post1")
    public String add(@RequestParam("username") String name,@RequestParam("age") Integer age){
        return "name:"+name+"\nage:"+age;
    }

    //POST传递字符串文本
    //通过HttpServletRequest获取输入流
    @PostMapping("/PostString")
    public String postString(HttpServletRequest request) {
        ServletInputStream is = null;
        try {
            is = request.getInputStream();
            StringBuilder sb = new StringBuilder();
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = is.read(buf)) != -1) {
                sb.append(new String(buf, 0, len));
            }
            System.out.println(sb.toString());
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //@requestbody可以接收GET或POST请求中的参数
    //把json作为参数传递,要用【RequestBody】
    //附带着说一下使用postman方式设置content-type为application/json方式测试后台接口
    @PostMapping("/user")
    public String user(@RequestBody User user){
        System.out.println(user.toString());
        return null;
    }
}


