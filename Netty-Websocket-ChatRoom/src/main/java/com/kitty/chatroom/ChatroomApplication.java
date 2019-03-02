package com.kitty.chatroom;

import com.kitty.chatroom.Server.ChatServer;
import com.kitty.chatroom.Server.ChatServerApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.security.auth.login.Configuration;

@SpringBootApplication
public class ChatroomApplication {

    public static void main(String[] args) throws Exception{

    //    SpringApplication.run(ChatroomApplication.class, args);

        ConfigurableApplicationContext context=SpringApplication.run(ChatroomApplication.class, args);
        ChatServerApplication chatServerApplication=context.getBean(ChatServerApplication.class);
        chatServerApplication.start();
    }

}
