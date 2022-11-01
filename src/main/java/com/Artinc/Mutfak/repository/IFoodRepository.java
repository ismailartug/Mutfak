package com.Artinc.Mutfak.repository;

import com.Artinc.Mutfak.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFoodRepository extends JpaRepository<Food, Long> {
}
