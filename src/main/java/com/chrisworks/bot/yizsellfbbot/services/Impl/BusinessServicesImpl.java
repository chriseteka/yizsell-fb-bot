package com.chrisworks.bot.yizsellfbbot.services.Impl;

import com.chrisworks.bot.yizsellfbbot.entities.Business;
import com.chrisworks.bot.yizsellfbbot.repos.BusinessRepository;
import com.chrisworks.bot.yizsellfbbot.services.BusinessServices;
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
public class BusinessServicesImpl implements BusinessServices {

    private final BusinessRepository businessRepository;

    @Override
    public Business create(Business business) {
        return null;
    }

    @Override
    public Business update(Long id, Business business) {
        return null;
    }

    @Override
    public Business getOne(Long id) {
        return null;
    }

    @Override
    public List<Business> getAll() {
        return null;
    }

    @Override
    public Business deleteOne(Long id) {
        return null;
    }
}
