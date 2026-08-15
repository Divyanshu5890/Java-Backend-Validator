package com.ecommerce.javavalidator.validator;
import com.ecommerce.javavalidator.model.UserData;
import com.ecommerce.javavalidator.model.ValidationResult;

import java.util.HashMap;
import java.util.Map;

public class UserValidator {
    private ValidationResult errorHolder(String field,String message){
      Map<String,String> errors = new HashMap<>();
      errors.put(field,message);
      return new ValidationResult(false,errors);
    }

    public ValidationResult ValidateName(UserData user) {

        if (user.getName() == null || user.getName().isEmpty()) {
            return errorHolder("name","Name is Required");
        }
        return new ValidationResult(true,new HashMap<>());
    }

    public ValidationResult ValidateEmail(UserData user) {

        if (user.getEmail() == null || user.getEmail().isEmpty()) {
          return errorHolder("Email", "Email is Required");
        }
        if (!user.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
           return errorHolder("Email", "Invalid Email");
        }
        return new ValidationResult(true,new HashMap<>());
    }

    public ValidationResult ValidatePassword(UserData user) {

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
           return errorHolder("Password", "Password is Required");
        }
        if (user.getPassword().length() < 6 || user.getPassword().matches("^[A-Z]+$") || user.getPassword().matches("^[a-z]+$")) {
            return errorHolder("Password", "Invalid Password");
        }
        return new ValidationResult(true,new HashMap<>());
    }

    public ValidationResult ValidatePhone(UserData user) {

        if (user.getPhone() == null || user.getPhone().isEmpty()) {
            return errorHolder("Phone", "Phone is Required");
        }
        if (user.getPhone().length() != 10) {
            return errorHolder("Phone", "Invalid Phone Number");
        }
        if (!user.getPhone().matches("^[0-9]+$")) {

            return errorHolder("Phone", "Invalid Phone Number");
        }
        if(!user.getPhone().startsWith("9")){
            return errorHolder("Phone", "Phone number must start with 9");
        }
        return new ValidationResult(true,new HashMap<>());
    }
}
