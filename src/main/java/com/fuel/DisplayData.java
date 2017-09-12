package com.fuel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class DisplayData {
    private final Interfejs interfejs;

    public DisplayData(Interfejs interfejs) {
        this.interfejs = interfejs;
    }

    @RequestMapping("/display")
    public String display(Model model){
        model.addAttribute("now", interfejs.findByLitry(40.31));
        return "index";
    }
    @RequestMapping(value = "/home")
    public String home(){
        String a = "Test";
        return a;
    }
}
