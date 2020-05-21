package com.chrisworks.bot.yizsellfbbot.entities;

import com.chrisworks.bot.yizsellfbbot.entities.enums.ORDER_STATUS;
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
@Table(name = "statuses")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private ORDER_STATUS orderStatus;

    private LocalDateTime updatedAt = LocalDateTime.now();

    public Status(ORDER_STATUS status) {
        this.orderStatus = status;
    }

    @PreUpdate
    private void changeUpdatedDate(){ this.updatedAt = LocalDateTime.now(); }
}
