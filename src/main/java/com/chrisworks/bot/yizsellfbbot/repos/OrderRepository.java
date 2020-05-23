package com.chrisworks.bot.yizsellfbbot.repos;

import com.chrisworks.bot.yizsellfbbot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Optional<Order> findDistinctByOrderId(String orderId);
    List<Order> findAllByCustomer_Email(String email);
}
