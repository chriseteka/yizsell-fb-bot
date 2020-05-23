package com.chrisworks.bot.yizsellfbbot.services;

import com.chrisworks.bot.yizsellfbbot.entities.Order;
import com.chrisworks.bot.yizsellfbbot.entities.Status;

import java.util.List;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
public interface OrderServices {

    Order createOrder(Order order);
    Order updateOrder(String orderId, Order order);
    Order getAnOrder(String orderId, String email);
    List<Order> getAllOrder(String email);
    Boolean deleteAnOrder(String orderId, String email);
    Boolean deleteAllOrder(String email);
    Status verifyOrder(String orderId, String email);
    Status confirmDelivery(String orderId, String email);
}
