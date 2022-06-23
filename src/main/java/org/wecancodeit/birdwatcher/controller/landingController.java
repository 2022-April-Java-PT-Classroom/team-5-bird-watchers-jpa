package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.Populator;
import org.wecancodeit.birdwatcher.model.BirdModel;
import org.wecancodeit.birdwatcher.repo.BirdRepository;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class landingController {

    @RequestMapping("/home")
    public String displayLandings(){
        return "landing.html";
    }
}
