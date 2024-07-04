package com.iablonski.crm.service;

import com.iablonski.crm.domain.company.Company;
import com.iablonski.crm.domain.user.Role;
import com.iablonski.crm.dto.company.CompanyDto;
import com.iablonski.crm.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Override
    public Company create(CompanyDto companyDto) {
        Company company = new Company();
        company.setEmail(companyDto.email());
        company.setPassword(companyDto.password());
        company.setRole(Role.ROLE_COMPANY);
        company.setRegisteredDate(LocalDateTime.now());

        return null;
    }
}
