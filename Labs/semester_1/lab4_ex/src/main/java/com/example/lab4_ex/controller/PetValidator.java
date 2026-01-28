package com.example.lab4_ex.controller;

import com.example.lab4_ex.Lab4ExApplication;
import com.example.lab4_ex.model.Pet;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Arrays;

public class PetValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Pet.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "",
                "Your pet needs a name!");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "food", "",
                "Your pet needs a food!");

        Pet pet = (Pet) target;

        if (!Arrays.asList(Lab4ExApplication.species).contains(pet.getSpecies())) {
            errors.rejectValue("species", "", "Your pet needs a species!");
        }

        if (Arrays.asList(Lab4ExApplication.species).contains(pet.getFood())) {
            errors.rejectValue("food", "", "Your pet can't eat another pet!");
        }
    }
}
