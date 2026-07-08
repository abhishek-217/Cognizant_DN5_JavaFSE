package com.cognizant.CountryService.controller;

import com.cognizant.CountryService.model.Country;
import com.cognizant.CountryService.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

//    for RESTful Country

    @GetMapping("/country")
    public Country getCountryIndia() {

        return countryService.getCountry("IN");

    }

//    With Code
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        return countryService.getCountry(code);

    }
}