package io.techlearner.coronavirustracker.controller;

import io.techlearner.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CoronaVirus {

    @Autowired
    public CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/coronaapp")
    public String home(Model model) {
    model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
        return "home";
    }
}
