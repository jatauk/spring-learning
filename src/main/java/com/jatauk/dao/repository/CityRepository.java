package com.jatauk.dao.repository;

import com.jatauk.dao.entitty.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
    
    City findByName(String name);
}
