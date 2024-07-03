package com.iablonski.crm.domain.order;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Document(collection = "order")
public class Order {
    @Id
    private UUID id;
    private UUID userId;
    private UUID translatorId;
    private UUID sourceLanguageId;
    private UUID targetLanguageId;
    private BigDecimal amount;
    private OrderStatus status;
    private LocalDateTime creationDate;
    private LocalDateTime startDate;
    private LocalDateTime completionDate;
    private List<UUID> translationFileIds;
}
