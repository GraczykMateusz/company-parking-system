package dev.graczykmateusz.companyparkingsystem.domain.employee;

import java.io.Serializable;
import java.util.UUID;

public record EmployeeId(UUID value) implements Serializable {
    
    public static EmployeeId UserId(UUID value) {
        return new EmployeeId(value);
    }
}
