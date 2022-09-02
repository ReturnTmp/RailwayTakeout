package com.itheima.railway.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.railway.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
