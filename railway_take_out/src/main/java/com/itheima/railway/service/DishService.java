package com.itheima.railway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.railway.dto.DishDto;
import com.itheima.railway.entity.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新对应的口味信息
    public void updateWithFlavor(DishDto dishDto);

    //根据菜品id删除菜品
    public void removeDishByIds(List<Long> ids);
}
