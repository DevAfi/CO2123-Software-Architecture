package com.example.lab2_ex.controller;

import com.example.lab2_ex.model.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Controller
public class MainController {
    @RequestMapping("/greeting")
    public String exA(Model model){
        model.addAttribute("value", "Hello World!");
        return "show";
    }

    @RequestMapping("/greeting/{greeting}/{name}")
    public String exB(@PathVariable String greeting, @PathVariable String name, Model model){
        model.addAttribute("value", greeting + " " + name);
        return "show";
    }

    @RequestMapping("/hello")
    public String exC(@RequestParam(defaultValue = "world!") String name, Model model){
        model.addAttribute("value", "Hello " + name);
        return "show";
    }

    @RequestMapping("/greeting/{value}")
    public String exD(@PathVariable String value, Model model){
        int val = Integer.parseInt(value);
        String finalStr = "Hello. ".repeat(val).trim();

        model.addAttribute("value", finalStr);
        return "show";
    }

    @RequestMapping("sum")
    public String exE(@RequestParam(defaultValue = "Nothing") Collection<Integer> values, Model model) {
        int sum = 0;
        for (Integer val : values) {
            sum += val;
        }
        model.addAttribute("value", sum);
        return "show";
    }



    @RequestMapping("myPet/{name}/{species}")
    public String exF(@ModelAttribute Pet pet, Model model){
        model.addAttribute("value", pet);
        return "show";
    }
}