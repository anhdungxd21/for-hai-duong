package com.practicetest.travel.service.country;

import com.practicetest.travel.model.Country;
import com.practicetest.travel.repository.CountryRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServiceIml implements CountryService  {
    @Autowired
    CountryRepository countryRepository;
    @Override
    public Iterable<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Country save(Country country) {
        return null;
    }
}
