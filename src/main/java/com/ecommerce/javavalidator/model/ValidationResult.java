package com.ecommerce.javavalidator.model;
import java.util.Map;

public class ValidationResult {
    private boolean valid;
    private Map<String,String> errors;

    public ValidationResult(boolean valid, Map<String,String> errors) {
        this.valid=valid;
        this.errors=errors;
    }
    public boolean isValid() {
        return valid;
    }
    public Map<String,String> getErrors() {
        return errors;
    }
}
