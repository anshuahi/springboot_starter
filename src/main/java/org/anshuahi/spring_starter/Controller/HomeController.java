package org.anshuahi.spring_starter.Controller;

import java.util.List;

import org.anshuahi.spring_starter.models.Post;
import org.anshuahi.spring_starter.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Post> posts = postService.getAll();
        model.addAttribute("posts", posts);
        return "home";
    }

    @GetMapping("/book")
    public String book(Model model) {
        return "book";
    }

    @GetMapping("/menu")
    public String menu(Model model) {
        return "menu";
    }

}
