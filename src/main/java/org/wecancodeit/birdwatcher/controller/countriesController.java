package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.wecancodeit.birdwatcher.repo.countriesRepository;

import javax.annotation.Resource;

@Controller
public class countriesController {

    @Resource
    private countriesRepository countriesRepo;

    @RequestMapping("/countries")
    public String displayCountries (Model model){
        model.addAttribute("countries", countriesRepo.findAll());
        return "countriesView";
    }

    @GetMapping("/countries/{id}")
    public String findOneCountry(@PathVariable Long id, Model model){
        model.addAttribute("countriesModel", countriesRepo.findById(id).get());
        return "countriesTemplate";
    }
}
