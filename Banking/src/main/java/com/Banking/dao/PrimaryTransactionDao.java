package com.Banking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Banking.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
