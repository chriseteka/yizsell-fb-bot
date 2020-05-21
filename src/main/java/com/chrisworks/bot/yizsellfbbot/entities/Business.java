package com.chrisworks.bot.yizsellfbbot.entities;

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
@Table(name = "businesses")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String email;
    private String number;
}
