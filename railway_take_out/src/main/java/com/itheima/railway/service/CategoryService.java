package com.itheima.railway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.railway.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
