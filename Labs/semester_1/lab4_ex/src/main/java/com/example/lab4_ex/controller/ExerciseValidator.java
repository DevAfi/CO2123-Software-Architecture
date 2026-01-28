package com.example.lab4_ex.controller;

import com.example.lab4_ex.Lab4ExApplication;
import com.example.lab4_ex.model.Exercise;
import com.example.lab4_ex.model.Goal;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.example.lab4_ex.model.Exercise;

import java.util.Arrays;

public class ExerciseValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Exercise.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Exercise exercise = (Exercise) target;

        for (Goal g: Lab4ExApplication.goalList) {
            for (Exercise e: g.getExercises()) {
                if (e.getId().equals(exercise.getId())) {
                    errors.rejectValue("id", "","ID already present");
                }
            }
        }

        if (exercise.getMinutes() < 10 ||  exercise.getMinutes() > 180) {
            errors.rejectValue("minutes","", "Minutes must be between 10 and 180");
        }
    }
}
