package org.anshuahi.spring_starter.services;

import org.anshuahi.spring_starter.models.Account;
import org.anshuahi.spring_starter.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account save(Account account) {
        return accountRepository.save(account);
    }

    // public
}
