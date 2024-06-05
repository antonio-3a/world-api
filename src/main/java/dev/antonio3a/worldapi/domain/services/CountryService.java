package dev.antonio3a.worldapi.domain.services;

import dev.antonio3a.worldapi.domain.entities.Country;
import dev.antonio3a.worldapi.domain.repositories.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public Country getCountryById(String id) {
        return countryRepository.findById(id).orElseThrow();
    }

    public Page<Country> getCountries(Pageable pageable) {
        return countryRepository.findAll(pageable);
    }
}
