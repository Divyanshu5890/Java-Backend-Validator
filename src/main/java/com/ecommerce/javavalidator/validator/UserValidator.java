package com.ecommerce.javavalidator.validator;
import com.ecommerce.javavalidator.model.UserData;

public class UserValidator {

    public boolean ValidateName(UserData user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean ValidateEmail(UserData user) {
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            return false;
        }
        return user.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public boolean ValidatePassword(UserData user) {
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            return false;
        }
        if (user.getPassword().length() < 6 || user.getPassword().matches("^[A-Z]+$") || user.getPassword().matches("^[a-z]+$")) {
            return false;
        }
        return true;
    }

    public boolean ValidatePhone(UserData user) {
        if (user.getPhone() == null || user.getPhone().isEmpty()) {
            return false;
        }
        if (user.getPhone().length() != 10) {
            return false;
        }
        if (!user.getPhone().matches("[0-9]+$")) {
            return false;
        }
        if(!user.getPhone().startsWith("9")){
            return false;
        }
        return true;
    }
}
