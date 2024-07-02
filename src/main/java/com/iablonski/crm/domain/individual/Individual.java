package com.iablonski.crm.domain.individual;

import com.iablonski.crm.domain.order.Order;
import com.iablonski.crm.domain.user.User;

import java.util.List;

public class Individual extends User {
    private String firstName;
    private String lastName;
    private List<Order> placedOrders;
}
