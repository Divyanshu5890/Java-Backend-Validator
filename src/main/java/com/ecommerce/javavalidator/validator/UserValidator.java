package com.ecommerce.javavalidator.validator;
import com.ecommerce.javavalidator.model.UserData;
import com.ecommerce.javavalidator.model.ValidationResult;

import java.util.List;

public class UserValidator {

    public ValidationResult ValidateName(UserData user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            return new ValidationResult(false,List.of("Name is required"));
        }
        return new ValidationResult(true,List.of());
    }

    public ValidationResult ValidateEmail(UserData user) {
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            return new ValidationResult(false, List.of("Please write valid email"));
        }
        if (!user.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            return new ValidationResult(false, List.of("Invalid email format"));
        }
        return new ValidationResult(true, List.of());
    }

    public ValidationResult ValidatePassword(UserData user) {
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            return new  ValidationResult(false, List.of("Password is required"));
        }
        if (user.getPassword().length() < 6 || user.getPassword().matches("^[A-Z]+$") || user.getPassword().matches("^[a-z]+$")) {
            return new ValidationResult(false, List.of("Password must be atleast 6 characters"));
        }
        return new ValidationResult(true, List.of());
    }

    public ValidationResult ValidatePhone(UserData user) {
        if (user.getPhone() == null || user.getPhone().isEmpty()) {
            return new ValidationResult(false, List.of("Phone number is required"));
        }
        if (user.getPhone().length() != 10) {
            return new ValidationResult(false, List.of("Phone number must be 10 characters"));
        }
        if (!user.getPhone().matches("^[0-9]+$")) {
            return new ValidationResult(false, List.of("Phone number must contain digits only"));
        }
        if(!user.getPhone().startsWith("9")){
            return new ValidationResult(false, List.of("Phone number must start with 9"));
        }
        return new ValidationResult(true, List.of());
    }
}
