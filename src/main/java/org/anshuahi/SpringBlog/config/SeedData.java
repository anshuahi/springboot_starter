package org.anshuahi.SpringBlog.config;

import java.util.List;

import org.anshuahi.SpringBlog.models.Account;
import org.anshuahi.SpringBlog.models.Post;
import org.anshuahi.SpringBlog.services.AccountService;
import org.anshuahi.SpringBlog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {

        Account account01 = new Account();
        Account account02 = new Account();
        account01.setEmail("account01@anshuahi.com");
        account01.setPassword("password01");
        account01.setFirstname("Account 01");

        account02.setEmail("account02@anshuahi.com");
        account02.setPassword("password02");
        account02.setFirstname("Account 02");

        accountService.save(account01);
        accountService.save(account02);

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
