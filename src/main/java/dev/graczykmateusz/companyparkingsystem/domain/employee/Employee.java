package dev.graczykmateusz.companyparkingsystem.domain.employee;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservations")
@Getter(AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Employee {
    
    @EmbeddedId
    @AttributeOverride(name = "value", column = @Column(name = "id"))
    private EmployeeId id;
}
