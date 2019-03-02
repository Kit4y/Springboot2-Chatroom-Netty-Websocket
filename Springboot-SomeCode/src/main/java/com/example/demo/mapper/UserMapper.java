package com.example.demo.mapper;


import com.example.demo.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {


    @Select({
            "select * from user"
    })
    List<User> listAll();

    @Insert({
            "insert into user(`username`, `password`) values(#{username}, #{password})"
    })
    int insert(User user);

    @Delete({
            "delete from user where id = #{userId}"
    })
    int remove(Integer userId);

    @Update({
            "update user set username = #{username}, password = #{password} where id = #{id}"
    })
    int update(User user);

}

