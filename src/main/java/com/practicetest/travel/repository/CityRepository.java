package com.practicetest.travel.repository;

import com.practicetest.travel.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    City findCityByNameCity(String name);
}
