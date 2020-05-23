package com.chrisworks.bot.yizsellfbbot.services.Impl;

import com.chrisworks.bot.yizsellfbbot.entities.Customer;
import com.chrisworks.bot.yizsellfbbot.repos.CustomerRepository;
import com.chrisworks.bot.yizsellfbbot.services.CustomerServices;
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
public class CustomerServicesImpl implements CustomerServices {

    private final CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Long id, Customer customer) {
        return null;
    }

    @Override
    public Customer getOne(Long id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public Customer deleteOne(Long id) {
        return null;
    }
}
