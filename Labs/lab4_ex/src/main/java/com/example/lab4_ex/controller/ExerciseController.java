package com.example.lab4_ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.example.lab4_ex.Lab4ExApplication;
import com.example.lab4_ex.model.Exercise;
import com.example.lab4_ex.model.Goal;

@Controller
public class ExerciseController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new ExerciseValidator());
    }

    /**
     * Look up a goal by goalId and add the provided exercise to it
     *
     * @param exercise
     * @param goalId
     * @return
     */
    @RequestMapping("/addExercise")
    public String addMinutes(@ModelAttribute Exercise exercise, @RequestParam Long goalId) {

        Goal goal = null;

        for (Goal g : Lab4ExApplication.goalList) {
            if (g.getId() == goalId) {
                goal = g;
                break;
            }
        }

        if (goal != null) {
            goal.getExercises().add(exercise);
            exercise.setGoal(goal);
        }

        return "fitness/showExercise";
    }

    /**
     * opens a form to add new exercises
     *
     * @param model
     * @return
     */
    @GetMapping("/exercise")
    public String exercise(Model model) {
        model.addAttribute("exercise", new Exercise());
        return "fitness/exercise";
    }
}
