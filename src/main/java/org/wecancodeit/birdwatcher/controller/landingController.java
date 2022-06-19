package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class landingController {

    @RequestMapping("/home")
    public String displayLandings(){
        return "landing.html";
    }

}
