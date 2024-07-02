package com.iablonski.crm.domain.translator;

import com.iablonski.crm.domain.order.Order;
import com.iablonski.crm.domain.user.User;

import java.util.List;

public class Translator extends User {
    private String firstName;
    private String lastName;
    private List <Language> languages;
    private List<Order> assignedOrders;
}
