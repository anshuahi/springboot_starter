package org.anshuahi.SpringBlog.config;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.anshuahi.SpringBlog.models.Account;
import org.anshuahi.SpringBlog.models.Authority;
import org.anshuahi.SpringBlog.models.Post;
import org.anshuahi.SpringBlog.services.AccountService;
import org.anshuahi.SpringBlog.services.AuthorityService;
import org.anshuahi.SpringBlog.services.PostService;
import org.anshuahi.SpringBlog.utils.constants.Privillages;
import org.anshuahi.SpringBlog.utils.constants.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private AuthorityService authorityService;

    @Override
    public void run(String... args) throws Exception {

        for (Privillages auth : Privillages.values()) {
            Authority authority = new Authority();
            authority.setId(auth.getId());
            authority.setName(auth.getPrivillage());
            authorityService.save(authority);
        }

        Account account01 = new Account();
        Account account02 = new Account();
        Account account03 = new Account();
        Account account04 = new Account();

        account01.setEmail("user@user.com");
        account01.setPassword("user123");
        account01.setFirstname("User");
        account01.setLastname("lastname");

        account02.setEmail("admin@admin.com");
        account02.setPassword("admin123");
        account02.setFirstname("Admin");
        account02.setLastname("adlast");
        account02.setRole(Roles.ADMIN.getRole());

        account03.setEmail("editor@editor.com");
        account03.setPassword("editor123");
        account03.setFirstname("Editor");
        account03.setLastname("edLast");
        account03.setRole(Roles.EDITOR.getRole());

        account04.setEmail("super-admin@super.com");
        account04.setPassword("pass123");
        account04.setFirstname("super_editor");
        account04.setLastname("lastname");
        account04.setRole(Roles.EDITOR.getRole());

        Set<Authority> authorities = new HashSet<>();
        authorityService.findById(Privillages.RESET_ANY_USER_PASSWORD.getId()).ifPresent(authorities::add);
        authorityService.findById(Privillages.ACCESS_ADMIN_PANEL.getId()).ifPresent(authorities::add);

        account04.setAuthorities(authorities);

        accountService.save(account01);
        accountService.save(account02);
        accountService.save(account03);
        accountService.save(account04);

        List<Post> posts = postService.getAll();
        if (posts.size() == 0) {
            Post post01 = new Post();
            post01.setTitle("Post 01");
            post01.setBody("Post Body 01...........");
            post01.setAccount(account01);
            postService.save(post01);

            Post post02 = new Post();
            post02.setTitle("Post 02");
            post02.setBody("Post Body 02...........");
            post02.setAccount(account02);
            postService.save(post02);

        }
    }

}
