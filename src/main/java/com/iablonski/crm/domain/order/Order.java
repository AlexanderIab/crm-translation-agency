package com.iablonski.crm.domain.order;

import com.iablonski.crm.domain.translator.Translator;
import com.iablonski.crm.domain.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Order {
    private UUID id;
    private User user;
    private Translator translator;
    private Language sourceLanguage;
    private Language targetLanguage;
    private BigDecimal amount;
    private OrderStatus status;
    private LocalDateTime creationDate;
    private LocalDateTime startDate;
    private LocalDateTime completionDate;
    private TranslationFile translationFile;
}
