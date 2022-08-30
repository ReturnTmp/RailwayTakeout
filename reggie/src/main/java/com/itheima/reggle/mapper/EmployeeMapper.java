package com.itheima.reggle.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggle.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
