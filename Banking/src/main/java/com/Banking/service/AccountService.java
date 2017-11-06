package com.Banking.service;

import java.security.Principal;

import com.Banking.domain.PrimaryAccount;
import com.Banking.domain.SavingsAccount;

public interface AccountService {
	
    PrimaryAccount createPrimaryAccount();
    
    SavingsAccount createSavingsAccount();
    
    void deposit(String accountType, double amount, Principal principal);
    
    void withdraw(String accountType, double amount, Principal principal);
    
}
