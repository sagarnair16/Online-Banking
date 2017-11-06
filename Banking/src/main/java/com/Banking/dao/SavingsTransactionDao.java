package com.Banking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Banking.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}
