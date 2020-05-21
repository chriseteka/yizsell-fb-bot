package com.chrisworks.bot.yizsellfbbot.entities.enums;

import java.util.stream.Stream;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
public enum ORDER_STATUS {

    PENDING_CONFIRMATION(100, "Order placed, business is yet to confirm"),
    CONFIRMED_AND_PACKAGING(200, "Order Confirmed and now being packaged"),
    SHIPPED(300, "Order is now been shipped, will be delivered soon"),
    DELIVERED(400, "Order has been delivered, awaiting customer to confirm"),
    CONFIRMED_DELIVERY(500, "Delivery confirmed, Transaction complete");

    private int statusCode;
    private String statusMessage;

    ORDER_STATUS(int code, String message){
        this.statusCode = code;
        this.statusMessage = message.toUpperCase();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public static ORDER_STATUS of(int statusCode){
        return Stream.of(ORDER_STATUS.values())
                .filter(order_status -> order_status.getStatusCode() == statusCode)
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }
}
