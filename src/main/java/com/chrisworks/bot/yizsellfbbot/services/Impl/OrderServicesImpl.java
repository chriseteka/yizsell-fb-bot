package com.chrisworks.bot.yizsellfbbot.services.Impl;

import com.chrisworks.bot.yizsellfbbot.entities.Order;
import com.chrisworks.bot.yizsellfbbot.repos.OrderItemRepository;
import com.chrisworks.bot.yizsellfbbot.repos.OrderRepository;
import com.chrisworks.bot.yizsellfbbot.repos.StatusRepository;
import com.chrisworks.bot.yizsellfbbot.services.OrderServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
@Service
@RequiredArgsConstructor
public class OrderServicesImpl implements OrderServices {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final StatusRepository statusRepository;

    @Override
    public Order create(Order order) {
        return null;
    }

    @Override
    public Order update(Long id, Order order) {
        return null;
    }

    @Override
    public Order getOne(Long id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public Order deleteOne(Long id) {
        return null;
    }
}
