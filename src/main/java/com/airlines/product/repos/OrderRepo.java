package com.airlines.product.repos;

import com.airlines.product.entity.Order;
import com.airlines.product.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

    List<Order> findByUser(User user);
    List<Order> findByUserId(Long userId);
    Order findOrderByIdAndUserId(Long orderId, Long userId);
}
