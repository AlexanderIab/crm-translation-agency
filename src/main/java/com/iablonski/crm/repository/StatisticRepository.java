package com.iablonski.crm.repository;

import com.iablonski.crm.domain.statistic.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatisticRepository extends JpaRepository<Statistic, UUID> {
}
