package dev.graczykmateusz.common.valueobjects;

import java.io.Serializable;
import java.util.Objects;

public record LicensePlate(String value) implements Serializable {
    
    public LicensePlate {
        if (Objects.nonNull(value) && (value.length() < 5 || value.length() > 8)) {
            throw new RuntimeException();
        }
    }

    public static LicensePlate of(String value) {
        return new LicensePlate(value);
    }
}
