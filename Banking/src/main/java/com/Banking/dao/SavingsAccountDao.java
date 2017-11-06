package com.Banking.dao;

import org.springframework.data.repository.CrudRepository;

import com.Banking.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
