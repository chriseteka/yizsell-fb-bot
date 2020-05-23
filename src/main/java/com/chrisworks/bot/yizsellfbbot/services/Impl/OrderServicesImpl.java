package com.chrisworks.bot.yizsellfbbot.services.Impl;

import com.chrisworks.bot.yizsellfbbot.entities.Order;
import com.chrisworks.bot.yizsellfbbot.entities.Status;
import com.chrisworks.bot.yizsellfbbot.entities.enums.ORDER_STATUS;
import com.chrisworks.bot.yizsellfbbot.repos.OrderRepository;
import com.chrisworks.bot.yizsellfbbot.repos.StatusRepository;
import com.chrisworks.bot.yizsellfbbot.services.OrderServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static com.chrisworks.bot.yizsellfbbot.utils.Utilities.orderUID;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
@Service
@RequiredArgsConstructor
public class OrderServicesImpl implements OrderServices {

    private final OrderRepository orderRepository;
    private final StatusRepository statusRepository;

    @Override
    public Order createOrder(Order order) {

        order.setOrderId(orderUID(order.getCustomer().getEmail()));
        order.setOrderStatus(statusRepository.save(new Status(ORDER_STATUS.PENDING_CONFIRMATION)));

        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(String orderId, Order order) {

        return orderRepository.findDistinctByOrderId(orderId)
                .map(existingOrder -> {
                    existingOrder.setOrderStatus(order.getOrderStatus());
                    existingOrder.setOrderItem(order.getOrderItem());
                    existingOrder.setPickUpAddress(order.getPickUpAddress());

                    return orderRepository.save(existingOrder);
                }).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Order getAnOrder(String orderId, String email) {

        return orderRepository.findDistinctByOrderId(orderId)
                .map(order -> {
                    if (!isCustomerOrder(order, email))
                        //TODO: Throw error here
                        return null;
                    return order;
                }).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Order> getAllOrder(String email) {

        return orderRepository.findAllByCustomer_Email(email);
    }

    @Override
    public Boolean deleteAnOrder(String orderId, String email) {

        return Optional.of(getAnOrder(orderId, email))
                .map(order -> {
                    orderRepository.delete(order);
                    return true;
                }).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Boolean deleteAllOrder(String email) {

        List<Order> allOrder = getAllOrder(email);
        orderRepository.deleteAll(allOrder);
        return !allOrder.isEmpty();
    }

    @Override
    public Status verifyOrder(String orderId, String email) {

        return orderRepository.findDistinctByOrderId(orderId)
                .map(order -> {
                    if (!isCustomerOrder(order, email))
                        //TODO: Throw error instead of returning null
                        return null;
                    return order.getOrderStatus();
                }).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Status confirmDelivery(String orderId, String email) {

        return orderRepository.findDistinctByOrderId(orderId)
                .map(order -> {
                    if (!isCustomerOrder(order, email))
                        //TODO: Throw error instead of returning null
                        return null;
                    order.getOrderStatus().setOrderStatus(ORDER_STATUS.CONFIRMED_DELIVERY);
                    return orderRepository.save(order).getOrderStatus();
                }).orElseThrow(NoSuchElementException::new);
    }

    private Boolean isCustomerOrder(Order order, String customerEmail){
        return order.getCustomer().getEmail().equalsIgnoreCase(customerEmail);
    }
}
