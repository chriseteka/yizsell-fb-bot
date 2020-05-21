package com.chrisworks.bot.yizsellfbbot.services;

import java.util.List;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
public interface CRUDServices<T> {

    T create(T t);

    T update(Long id, T t);

    T getOne(Long id);

    List<T> getAll();

    T deleteOne(Long id);
}
