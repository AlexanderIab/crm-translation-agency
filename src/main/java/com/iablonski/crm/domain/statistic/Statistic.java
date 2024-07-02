package com.iablonski.crm.domain.statistic;

import com.iablonski.crm.domain.order.Order;
import com.iablonski.crm.domain.user.User;

import java.math.BigDecimal;
import java.util.List;

public class Statistic {
    private User user;
    private BigDecimal totalAmount;
    private int totalOrders;
    private List<Order> orderHistory;
}
