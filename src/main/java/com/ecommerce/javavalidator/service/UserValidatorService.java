package com.ecommerce.javavalidator.service;
import com.ecommerce.javavalidator.model.ValidationResult;
import com.ecommerce.javavalidator.validator.UserValidator;
import com.ecommerce.javavalidator.model.UserData;

import java.util.HashMap;
import java.util.Map;

public class UserValidatorService {
    private UserValidator validator = new UserValidator();

    public ValidationResult validateUser(UserData user) {
       Map<String,String> errors = new HashMap<>();
        ValidationResult result=validator.ValidateName(user);
        if(!result.isValid()){
            errors.putAll(result.getErrors());

        }
        ValidationResult result1=validator.ValidateEmail(user);
        if(!result1.isValid()){
            errors.putAll(result1.getErrors());
        }
        ValidationResult result2=validator.ValidatePassword(user);
        if(!result2.isValid()){
            errors.putAll(result2.getErrors());
        }
        ValidationResult result3=validator.ValidatePhone(user);
        if(!result3.isValid()){
            errors.putAll(result3.getErrors());
        }
        return new ValidationResult(errors.isEmpty(),errors);

    }

}
