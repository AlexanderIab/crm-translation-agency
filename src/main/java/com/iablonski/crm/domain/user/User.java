package com.iablonski.crm.domain.user;

import com.iablonski.crm.domain.statistic.Statistic;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class User {
    private UUID id;
    private String email;
    private String password;
    private Role role;
    private LocalDateTime registeredDate;
    private Statistic statistics;
}
