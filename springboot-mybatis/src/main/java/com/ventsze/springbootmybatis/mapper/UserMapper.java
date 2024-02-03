package com.ventsze.springbootmybatis.mapper;

import com.ventsze.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where id =#{id}")
    public User findByid(Integer id);

}
