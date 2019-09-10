package com.ranjay.bank.techfish.dao;

import com.ranjay.bank.techfish.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by z00382545 on 10/21/16.
 */
@Repository
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
