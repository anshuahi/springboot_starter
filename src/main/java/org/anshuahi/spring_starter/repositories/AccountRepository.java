package org.anshuahi.spring_starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import org.anshuahi.spring_starter.models.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    public static Optional<Account> findOneByEmailIgnoreCase(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOneByEmailIgnoreCase'");
    }

}
