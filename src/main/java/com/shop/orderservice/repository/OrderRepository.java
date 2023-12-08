package com.shop.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
