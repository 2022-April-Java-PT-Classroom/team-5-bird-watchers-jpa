package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.habitatRepository;

import javax.annotation.Resource;

@Controller
public class habitatController {

    @Resource
    private habitatRepository habitatRepo;

    @RequestMapping("/habitats")
    public String displayHabitats (Model model){
        model.addAttribute("habitats", habitatRepo.findAll());
        return "habitatsView";
    }

    @GetMapping("/habitats/{id}")
    public String findOneHabitat(@PathVariable Long id, Model model){
        model.addAttribute("habitatModel", habitatRepo.findById(id).get());
        return "habitatTemplate";
    }
}
