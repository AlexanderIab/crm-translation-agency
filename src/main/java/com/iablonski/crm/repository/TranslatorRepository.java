package com.iablonski.crm.repository;

import com.iablonski.crm.domain.translator.Translator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TranslatorRepository extends JpaRepository<Translator, UUID> {
}
