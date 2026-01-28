package com.example.lab4_ex.controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

import com.example.lab4_ex.Lab4ExApplication;
import com.example.lab4_ex.model.Exercise;
import com.example.lab4_ex.model.Goal;

@Controller
public class GoalController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new GoalValidator());
    }

    /**
     * Stores all goals in the model attribute goals
     *
     * @param model
     * @return
     */
    @GetMapping("/getGoals")
    public String getGoals(Model model) {
        List<Goal> goals = Lab4ExApplication.goalList;

        model.addAttribute("goals", goals);

        return "fitness/listGoals";
    }

    /**
     * Adds a new goal
     *
     * @param goal
     * @param exerciseDesc
     * @return
     */
    @RequestMapping("/addGoal")
    public String updateGoal(@Valid @ModelAttribute Goal goal,BindingResult result,  @RequestParam String exerciseDesc) {
        if (result.hasErrors()) {
            return "fitness/goal";
        }
        Exercise exercise = new Exercise();
        exercise.setActivity(exerciseDesc);
        List<Exercise> list = new ArrayList<Exercise>();
        list.add(exercise);
        goal.setExercises(list);

        Lab4ExApplication.goalList.add(goal);

        return "redirect:/";
    }

    /**
     * Show a form to create a new goal
     * @param model
     * @return
     */
    @GetMapping("/goal")
    public String goal(Model model) {
        model.addAttribute("goal", new Goal());
        return "fitness/goal";
    }
}
