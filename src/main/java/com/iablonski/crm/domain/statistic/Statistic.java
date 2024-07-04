package com.iablonski.crm.domain.statistic;

import com.iablonski.crm.domain.user.UserMarker;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
public class Statistic {
    private UUID id;
    @OneToOne
    @JoinColumn(name = "user_id")
    @JoinColumn(name = "user_type", referencedColumnName = "DTYPE", insertable = false, updatable = false)
    private UserMarker userMarker;
    private BigDecimal totalAmount;
    private int totalOrders;
    private List<UUID> orderHistoryIds;
}
