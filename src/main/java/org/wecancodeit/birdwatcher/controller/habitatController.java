package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.birdwatcher.repo.habitatRepository;

import javax.annotation.Resource;

@Controller
public class habitatController {

    @Resource
    private habitatRepository habitatRepo;

    @GetMapping("/habitats")
    public String findAllHabitats (Model model){
        model.addAttribute("habitats", habitatRepo.findAll());
        return "habitatsTemplate";
    }

    @GetMapping("/habitat")
    public String findOneHabitat(@RequestParam(value = "id") Long id, Model model){
        model.addAttribute("habitatModel", habitatRepo.findById(id).get());
        return "habitatTemplate";
    }
}
