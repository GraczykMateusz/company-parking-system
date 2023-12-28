package dev.graczykmateusz.companyparkingsystem.domain.valueobjects;

import java.util.Objects;

public record LicensePlate(String value) {
    
    public LicensePlate {
        if (Objects.nonNull(value) && (value.length() < 5 || value.length() > 8)) {
            throw new RuntimeException();
        }
    }
}
