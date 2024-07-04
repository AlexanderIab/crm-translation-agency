package com.iablonski.crm.dto.company;

public record CompanyDto(String email,
                         String password,
                         String passwordConfirmation,
                         String name,
                         String address) {
}
