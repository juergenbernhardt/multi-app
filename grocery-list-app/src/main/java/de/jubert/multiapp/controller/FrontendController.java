package de.jubert.multiapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grocery")
public class FrontendController {

    @GetMapping("")
    public String index(final Model model) {
        model.addAttribute("hello", "Hello from GroceryListApp");
        return "hello";
    }

}
