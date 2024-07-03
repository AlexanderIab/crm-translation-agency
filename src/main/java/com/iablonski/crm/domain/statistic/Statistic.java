package com.iablonski.crm.domain.statistic;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Statistic {
    private UUID id;
    private UUID userId;
    private BigDecimal totalAmount;
    private int totalOrders;
    private List<UUID> orderHistoryIds;
}
