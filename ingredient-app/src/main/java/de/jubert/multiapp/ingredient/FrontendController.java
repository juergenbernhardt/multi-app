package de.jubert.multiapp.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ingredient")
public class FrontendController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("")
    public String index(final Model model) {
        model.addAttribute("hello", "Hello from IngredientApp");
        return "ingredients";
    }

    @GetMapping("/hello")
    public String index(final Model model) {
        model.addAttribute("ingredients", "Hello from IngredientApp");
        return "hello";
    }

}
