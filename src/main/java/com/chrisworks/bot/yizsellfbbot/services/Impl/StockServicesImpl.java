package com.chrisworks.bot.yizsellfbbot.services.Impl;

import com.chrisworks.bot.yizsellfbbot.entities.Stock;
import com.chrisworks.bot.yizsellfbbot.repos.StockRepository;
import com.chrisworks.bot.yizsellfbbot.services.StockServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chris_Eteka
 * @since 5/21/2020
 * @email chriseteka@gmail.com
 */
@Service
@RequiredArgsConstructor
public class StockServicesImpl implements StockServices {

    private final StockRepository stockRepository;

    @Override
    public Stock create(Stock stock) {
        return null;
    }

    @Override
    public Stock update(Long id, Stock stock) {
        return null;
    }

    @Override
    public Stock getOne(Long id) {
        return null;
    }

    @Override
    public List<Stock> getAll() {
        return null;
    }

    @Override
    public Stock deleteOne(Long id) {
        return null;
    }
}
