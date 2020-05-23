package com.chrisworks.bot.yizsellfbbot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orderItems")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
    @JoinTable(name = "orderItemsStocks", joinColumns = @JoinColumn(name = "orderItemId",
              nullable = false), inverseJoinColumns = @JoinColumn(name = "stockId"))
    private Set<Stock> items;

    private int quantity;
}
