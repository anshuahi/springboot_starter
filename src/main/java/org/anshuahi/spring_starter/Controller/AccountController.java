package org.anshuahi.spring_starter.Controller;

import org.anshuahi.spring_starter.models.Account;
import org.anshuahi.spring_starter.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/register")
    public String register(Model model) {
        Account account = new Account();
        model.addAttribute("account", account);

        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute Account account) {
        accountService.save(account);
        return "redirect:/";
    }

}
