package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.birdwatcher.repo.countriesRepository;

import javax.annotation.Resource;

@Controller
public class countriesController {

    @Resource
    private countriesRepository countriesRepo;

    @RequestMapping("/countries")
    public String displayCountries (Model model){
        model.addAttribute("countries", countriesRepo.findAll());
        return "countriesTemplate";
    }

    @GetMapping("/country")
    public String findOneCountry(@RequestParam(value = "id") Long id, Model model){
        model.addAttribute("countriesModel", countriesRepo.findById(id).get());
        return "countryTemplate";
    }
}
