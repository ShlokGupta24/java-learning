package web;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import service.IGreetingService;

@Controller
public class teluskoController {
    @Autowired
    private IGreetingService service;

    @GetMapping("/greeting")
    public String generateWish1(Model model){
        String res=service.generateGreeting();
        model.addAttribute("wish",res);
        return "greet";
    }

}
