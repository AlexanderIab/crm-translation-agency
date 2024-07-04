package com.iablonski.crm.repository;

import com.iablonski.crm.domain.order.TranslationFile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface TranslationFileRepository
        extends MongoRepository<TranslationFile, UUID> {
}
