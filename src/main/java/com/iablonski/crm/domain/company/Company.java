package com.iablonski.crm.domain.company;

import com.iablonski.crm.domain.user.Role;
import com.iablonski.crm.domain.user.User;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "companies")
public class Company extends User {
    @Column(nullable = false)
    private String name;
    private String address;
    @ElementCollection
    @CollectionTable(name = "companies_orders",
            joinColumns = @JoinColumn(name = "company_id"))
    private List<UUID> placedOrdersIds;

    public Company(UUID id, String email, String password, Role role,
                   LocalDateTime registeredDate, UUID statisticId,
                   String name, String address, List<UUID> placedOrdersIds) {
        super(id, email, password, role, registeredDate, statisticId);
        this.name = name;
        this.address = address;
        this.placedOrdersIds = placedOrdersIds;
    }
}
