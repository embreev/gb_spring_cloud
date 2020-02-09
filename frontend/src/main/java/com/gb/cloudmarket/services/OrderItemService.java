package com.gb.cloudmarket.services;

import entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.OrderItemRepository;

@Service
public class OrderItemService {
    private OrderItemRepository orderItemRepository;

    @Autowired
    public void setOrderItemRepository(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public boolean isUserCanWriteReview(Long productId, User user) {
        return orderItemRepository.findByProductIdAndUser(productId, user) != null;
    }
}