package com.iablonski.crm.repository;

import com.iablonski.crm.domain.individual.Individual;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IndividualRepository extends JpaRepository<Individual, UUID> {
}
