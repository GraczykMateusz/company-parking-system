package dev.graczykmateusz.companyparkingsystem.domain.valueobjects;

import lombok.Value;

@Value(staticConstructor = "of")
class Capacity {
    
    int value;
}
