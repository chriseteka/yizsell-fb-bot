package com.chrisworks.bot.yizsellfbbot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "stocks")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String itemName;

    @JsonIgnore
    @ManyToOne
    @JoinTable(name = "stockOwners", joinColumns = @JoinColumn(name = "stockId",
            nullable = false), inverseJoinColumns = @JoinColumn(name = "businessId"))
    @Column(nullable = false)
    private Business owner;
}
