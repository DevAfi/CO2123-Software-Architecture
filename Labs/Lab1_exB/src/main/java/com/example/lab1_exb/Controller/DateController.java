package com.example.lab1_exb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DateController {
    @RequestMapping("/whatDate");
    public String sayDate(Model model){
        model.addAttribute("","")
    }
}
