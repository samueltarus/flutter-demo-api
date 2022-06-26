package com.flutterDemo.flutterDemo.service.impl;

import com.flutterDemo.flutterDemo.model.Order;
import com.flutterDemo.flutterDemo.repository.OrderRepository;
import com.flutterDemo.flutterDemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> listOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order placeOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order order, Long orderId) {

        Order orders=orderRepository.findById(orderId).get();
        if (orders!=null)
            return   orderRepository.save(orders);

        return orderRepository.save(order);

    }

    @Override
    public void deleteOrderById(Long orderId) {

    }
}
