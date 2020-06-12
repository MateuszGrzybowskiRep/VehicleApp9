package com.grzybowski.mateusz.vehicle.fullVehicleAplication.controllers;

import com.grzybowski.mateusz.vehicle.fullVehicleAplication.models.Country;
import com.grzybowski.mateusz.vehicle.fullVehicleAplication.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(Model model){

        List<Country> countryList = countryService.getCountries();

        model.addAttribute("countries",countryList);

        return "country";
    }

}