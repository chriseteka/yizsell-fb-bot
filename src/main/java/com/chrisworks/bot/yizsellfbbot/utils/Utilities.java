package com.chrisworks.bot.yizsellfbbot.utils;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
public class Utilities {

    public static String orderUID(String email) {

        long UNIQUE_ID = (System.currentTimeMillis());

        String userData = email.split("@")[0].toUpperCase().substring(0, 6);
        //format invoice to take the form "CHRIS-4576282", given "chriseteka@gmail.com"
        return userData + "-" + String.valueOf(UNIQUE_ID).substring(3, 12);
    }
}
