package com.iablonski.crm.domain.company;

import com.iablonski.crm.domain.order.Order;
import com.iablonski.crm.domain.user.User;

import java.util.List;

public class Company extends User {
    private String name;
    private String address;
    private List<Order> placedOrders;
}
