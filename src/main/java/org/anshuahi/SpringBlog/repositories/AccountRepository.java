package org.anshuahi.SpringBlog.repositories;

import org.anshuahi.SpringBlog.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    public Optional<Account> findOneByEmailIgnoreCase(String email);

}
