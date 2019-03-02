package com.kitty.chatroom.Server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ChatServerApplication {

    @Autowired
    @Qualifier("bootstrap")
    private ServerBootstrap serverBootstrap;

    private Channel channel;

    public void start() throws Exception{
        System.out.println("Netty启动");
        channel=serverBootstrap.bind(8888).sync().channel().closeFuture().sync().channel();
    }

    public void close(){
        channel.close();
        channel.parent().close();
    }
}
