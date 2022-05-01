package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @RequestMapping("/home")
    public String home(Model model)
    {
        String str= "home";
        model.addAttribute("name",str);
        return "home";
    }


}
