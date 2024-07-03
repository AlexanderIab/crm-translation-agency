package com.iablonski.crm.domain.translator;

import com.iablonski.crm.domain.user.Role;
import com.iablonski.crm.domain.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "translators")
@NoArgsConstructor
public class Translator extends User {
    private String firstName;
    private String lastName;
    private List <UUID> languagesIds;
    private List<UUID> assignedOrdersIds;

    public Translator(UUID id, String email, String password,
                      Role role, LocalDateTime registeredDate,
                      UUID statisticIds, String firstName,
                      String lastName, List<UUID> languagesIds,
                      List<UUID> assignedOrdersIds) {
        super(id, email, password, role, registeredDate, statisticIds);
        this.firstName = firstName;
        this.lastName = lastName;
        this.languagesIds = languagesIds;
        this.assignedOrdersIds = assignedOrdersIds;
    }
}
