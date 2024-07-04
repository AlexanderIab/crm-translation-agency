package com.iablonski.crm.domain.employee;

import com.iablonski.crm.domain.user.Role;
import com.iablonski.crm.domain.user.AbstractUser;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "employees")
@NoArgsConstructor
public class Employee extends AbstractUser {
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    public Employee(UUID id, String email, String password,
                    Role role, LocalDateTime registeredDate,
                    UUID statisticId, String firstName, String lastName) {
        super(id, email, password, role, registeredDate, statisticId);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
