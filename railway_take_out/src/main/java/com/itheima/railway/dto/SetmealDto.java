package com.itheima.railway.dto;

import com.itheima.railway.entity.Setmeal;
import com.itheima.railway.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
