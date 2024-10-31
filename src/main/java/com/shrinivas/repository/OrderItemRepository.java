package com.shrinivas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shrinivas.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
