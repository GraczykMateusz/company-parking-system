package dev.graczykmateusz.companyparkingsystem.domain.user;

import java.util.UUID;

public record UserId(UUID value) {
    
    public static UserId UserId(UUID value) {
        return new UserId(value);
    }
}
