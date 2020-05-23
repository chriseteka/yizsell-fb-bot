package com.chrisworks.bot.yizsellfbbot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "businesses")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String email;
    private String number;

    @JsonIgnore
    @OneToMany
    @JoinTable(name = "businessOrders", joinColumns = @JoinColumn(name = "businessId",
            nullable = false), inverseJoinColumns = @JoinColumn(name = "orderId"))
    private Set<Order> orders;

    @JsonIgnore
    @OneToMany
    @JoinTable(name = "stockOwners", joinColumns = @JoinColumn(name = "businessId",
            nullable = false), inverseJoinColumns = @JoinColumn(name = "stockId"))
    private Set<Stock> stocks;
}
