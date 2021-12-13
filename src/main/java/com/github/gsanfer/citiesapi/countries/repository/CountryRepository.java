package com.github.gsanfer.citiesapi.countries.repository;

import com.github.gsanfer.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {


}
