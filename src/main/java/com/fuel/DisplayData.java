package com.fuel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayData {

    @RequestMapping("/display")
    public String display(Model model){
        model.addAttribute("now", "Test");
        return "index";
    }
}
