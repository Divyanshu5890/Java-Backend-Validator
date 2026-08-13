package com.ecommerce.javavalidator.service;
import com.ecommerce.javavalidator.validator.UserValidator;
import com.ecommerce.javavalidator.model.UserData;
public class UserValidatorService {
    private UserValidator validator = new UserValidator();

    public boolean validateUser(UserData user) {

        if (!validator.ValidateName(user)) {
            return false;
        }

        if (!validator.ValidateEmail(user)) {
            return false;
        }

        if (!validator.ValidatePassword(user)) {
            return false;
        }

        if (!validator.ValidatePhone(user)) {
            return false;
        }

        return true;
    }
}
