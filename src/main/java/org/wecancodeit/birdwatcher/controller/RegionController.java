package org.wecancodeit.birdwatcher.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.birdwatcher.repo.RegionRepository;

import javax.annotation.Resource;

@Controller
public class RegionController {
    @Resource
    private RegionRepository regionRepo;


    @GetMapping("/regions")
    public String findAllRegions(Model model){
        model.addAttribute("regions",regionRepo.findAll());
        return "regions";
    }

    @GetMapping("/region")
    public String findOneRegion(@RequestParam(value="id") Long id,Model model){
        model.addAttribute("region",regionRepo.findById(id).get());
        return "region";
    }


}
