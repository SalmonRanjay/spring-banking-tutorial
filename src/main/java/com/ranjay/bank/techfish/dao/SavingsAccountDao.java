package com.ranjay.bank.techfish.dao;

import com.ranjay.bank.techfish.domain.SavingsAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by z00382545 on 10/21/16.
 */
@Repository
public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
