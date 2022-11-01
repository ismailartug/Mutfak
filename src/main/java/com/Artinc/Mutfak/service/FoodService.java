package com.Artinc.Mutfak.service;

import com.Artinc.Mutfak.model.Food;
import com.Artinc.Mutfak.repository.IFoodRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class FoodService implements IFoodService{

    private final IFoodRepository foodRepository;

    public FoodService(IFoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public Food saveBook(Food food) {
        food.setCreateTime(LocalDateTime.now());
        return foodRepository.save(food);
    }

    @Override
    public List<Food> findAllFoods() {return foodRepository.findAll();}

    @Override
    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }
}
