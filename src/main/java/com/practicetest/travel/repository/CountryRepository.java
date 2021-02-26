package com.practicetest.travel.repository;

import com.practicetest.travel.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country,Long> {
    Country findCountryByName(String name);
}
