package com.iablonski.crm.domain.company;

import com.iablonski.crm.domain.statistic.Statistic;
import com.iablonski.crm.domain.user.UserMarker;
import com.iablonski.crm.domain.user.Role;
import com.iablonski.crm.domain.user.AbstractUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "companies")
public class Company extends AbstractUser implements UserMarker {
    @Column(nullable = false)
    private String name;
    private String address;
    @ElementCollection
    @CollectionTable(name = "companies_orders",
            joinColumns = @JoinColumn(name = "company_id"))
    private List<UUID> placedOrdersIds;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Statistic statistic;

}
