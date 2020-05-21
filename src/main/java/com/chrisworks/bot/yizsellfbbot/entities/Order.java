package com.chrisworks.bot.yizsellfbbot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String orderId;
    private String pickUpAddress;
    private LocalDateTime orderDate;
    @OneToOne
    private Status orderStatus;
    @OneToOne
    private OrderItem orderItem;
    @ManyToOne
    @JoinTable(name = "customerOrders", joinColumns = @JoinColumn(name = "orderId",
            nullable = false), inverseJoinColumns = @JoinColumn(name = "customerId"))
    private Customer customer;
    @ManyToOne
    @JoinTable(name = "businessOrders", joinColumns = @JoinColumn(name = "orderId",
            nullable = false), inverseJoinColumns = @JoinColumn(name = "businessId"))
    private Business business;
}
