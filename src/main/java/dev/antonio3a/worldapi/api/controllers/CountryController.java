package dev.antonio3a.worldapi.api.controllers;

import dev.antonio3a.worldapi.domain.entities.Country;
import dev.antonio3a.worldapi.domain.services.CountryService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/world/api/countries")
@SecurityRequirements(value = {
        @SecurityRequirement(name = "JWT"),
        @SecurityRequirement(name = "OAUTH2")
})
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable String id) {
        return countryService.getCountryById(id);
    }

    @GetMapping
    public Page<Country> getCountries(@RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "10") int size,
                                         @RequestParam(defaultValue = "ASC") String sortDirection,
                                         @RequestParam(defaultValue = "code") String... sortBy) {
        return countryService.getCountries(page, size, sortDirection, sortBy);
    }
}
