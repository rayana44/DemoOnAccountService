package com.example.accountservice.service;

import com.example.accountservice.dto.CreditCardApplicationRequest;
import com.example.accountservice.entity.Account;
import com.example.accountservice.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Optional<Account> getAccountByAccountNumber(String accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }

    public void applyForCreditCard(CreditCardApplicationRequest request) {
        // Hook for publishing this request to a card service when messaging is wired in.
    }
}
