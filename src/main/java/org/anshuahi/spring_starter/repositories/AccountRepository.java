package org.anshuahi.spring_starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.anshuahi.spring_starter.models.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
