package dev.antonio3a.worldapi.api.controllers;

import dev.antonio3a.worldapi.domain.services.CountryLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/world/api/country-languages")
public class CountryLanguageController {

    private final CountryLanguageService countryLanguageService;
}
