package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.birdwatcher.repo.ContinentRepository;

import javax.annotation.Resource;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;

    @GetMapping("/continents")
    public String findAllContinents(Model model){
        model.addAttribute("continents", continentRepo.findAll());
        return "continents";
    }

    @GetMapping("/continent")
    public String findOneContinent(@RequestParam(value="id") Long id, Model model){
        model.addAttribute("continent", continentRepo.findById(id).get());
        return "continent";
        
    }


}
