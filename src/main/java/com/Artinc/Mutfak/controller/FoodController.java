package com.Artinc.Mutfak.controller;

import com.Artinc.Mutfak.model.Food;
import com.Artinc.Mutfak.service.IFoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    private IFoodService foodService;

    @PostMapping("/saveFood")//saveFood
    public ResponseEntity<?> saveBook(@RequestBody Food food)
    {
        return new ResponseEntity<>(foodService.saveBook(food), HttpStatus.CREATED);

    }

    @GetMapping("/getAllFoods")//getAllFoods
    public ResponseEntity<?> getAllFoods()
    {
        return new ResponseEntity<>(foodService.findAllFoods(),HttpStatus.OK);
    }

    @DeleteMapping("api/deleteFood/{id}")
    public ResponseEntity<?> deleteFood(Long id)
    {
        foodService.deleteFood(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    

    //deleteFood
}
