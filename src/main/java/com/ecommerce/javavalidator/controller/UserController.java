package com.ecommerce.javavalidator.controller;

import com.ecommerce.javavalidator.service.UserValidatorService;
import com.ecommerce.javavalidator.validator.UserValidator;

import com.ecommerce.javavalidator.model.UserData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user")
public class UserController {
    private UserValidatorService service = new UserValidatorService();

    @PostMapping("/validate")
    public boolean validateUser(@RequestBody UserData user) {
        return service.validateUser(user);
    }

}
