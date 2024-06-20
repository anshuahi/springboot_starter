package org.anshuahi.SpringBlog.services;

import org.anshuahi.SpringBlog.models.Authority;
import org.anshuahi.SpringBlog.repositories.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService {
    @Autowired
    private AuthorityRepository authorityRepository;

    public Authority save(Authority authority) {
        return authorityRepository.save(authority);
    }
}
