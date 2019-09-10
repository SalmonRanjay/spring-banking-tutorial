package com.ranjay.bank.techfish.service;

import java.security.Principal;

import com.ranjay.bank.techfish.domain.PrimaryAccount;
import com.ranjay.bank.techfish.domain.SavingsAccount;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
