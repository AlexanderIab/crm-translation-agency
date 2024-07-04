package com.iablonski.crm.repository;

import com.iablonski.crm.domain.order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface OrderRepository extends MongoRepository<Order, UUID> {
}
