package com.iablonski.crm.domain.individual;

import com.iablonski.crm.domain.user.Role;
import com.iablonski.crm.domain.user.User;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "individuals")
@NoArgsConstructor
public class Individual extends User {
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @ElementCollection
    @CollectionTable(name = "individuals_orders",
            joinColumns = @JoinColumn(name = "individual_id"))
    private List<UUID> placedOrders;

    public Individual(UUID id, String email, String password, Role role,
                      LocalDateTime registeredDate, UUID statisticId,
                      String firstName, String lastName,
                      List<UUID> placedOrders) {
        super(id, email, password, role, registeredDate, statisticId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.placedOrders = placedOrders;
    }
}
