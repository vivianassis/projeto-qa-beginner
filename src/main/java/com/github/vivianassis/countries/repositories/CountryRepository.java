package com.github.vivianassis.countries.repositories;

import com.github.vivianassis.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
