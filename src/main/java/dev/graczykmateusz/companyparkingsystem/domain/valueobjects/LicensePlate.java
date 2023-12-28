package dev.graczykmateusz.companyparkingsystem.domain.valueobjects;

import lombok.Value;

@Value(staticConstructor = "of")
public class LicensePlate {
    
    String value;
    
    private LicensePlate(String value) {
        if (value == null || value.length() < 5 || value.length() > 8) {
            throw new RuntimeException();
        }
        this.value = value;
    }
}
