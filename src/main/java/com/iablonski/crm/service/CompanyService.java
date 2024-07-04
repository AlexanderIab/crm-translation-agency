package com.iablonski.crm.service;

import com.iablonski.crm.domain.company.Company;
import com.iablonski.crm.dto.company.CompanyDto;

public interface CompanyService {

    Company create(CompanyDto companyDto);
}
