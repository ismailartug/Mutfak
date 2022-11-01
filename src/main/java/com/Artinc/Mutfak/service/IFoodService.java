package com.Artinc.Mutfak.service;

import com.Artinc.Mutfak.model.Food;
import java.util.List;

public interface IFoodService {
    Food saveBook(Food food);

    List<Food> findAllFoods();

    void deleteFood(Long id);
}
