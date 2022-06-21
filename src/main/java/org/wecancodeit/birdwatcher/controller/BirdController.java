package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.birdwatcher.repo.BirdRepository;

import javax.annotation.Resource;

@Controller
public class BirdController {
    @Resource
    private BirdRepository birdRepo;

    @GetMapping("/birds")
    public String findAllBirds(Model model){
        model.addAttribute("birds", birdRepo.findAll());
        return "birds";
    }

    @GetMapping("/bird")
    public String findOneBird(@RequestParam(value="id") Long id, Model model){
        model.addAttribute("bird", birdRepo.findById(id).get());
        return "bird";
    }
}
