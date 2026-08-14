package com.ecommerce.javavalidator.service;
import com.ecommerce.javavalidator.model.ValidationResult;
import com.ecommerce.javavalidator.validator.UserValidator;
import com.ecommerce.javavalidator.model.UserData;

import java.util.ArrayList;
import java.util.List;

public class UserValidatorService {
    private UserValidator validator = new UserValidator();

    public ValidationResult validateUser(UserData user) {
        List<String>errors=new ArrayList<>();
        ValidationResult result=validator.ValidateName(user);
        if(!result.isValid()){
            errors.addAll(result.getErrors());

        }
        ValidationResult result1=validator.ValidateEmail(user);
        if(!result1.isValid()){
            errors.addAll(result1.getErrors());
        }
        ValidationResult result2=validator.ValidatePassword(user);
        if(!result2.isValid()){
            errors.addAll(result2.getErrors());
        }
        ValidationResult result3=validator.ValidatePhone(user);
        if(!result3.isValid()){
            errors.addAll(result3.getErrors());
        }
        return new ValidationResult(errors.isEmpty(),errors);

    }

}
