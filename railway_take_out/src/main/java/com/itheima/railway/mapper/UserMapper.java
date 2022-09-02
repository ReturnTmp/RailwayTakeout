package com.itheima.railway.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.railway.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
