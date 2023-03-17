package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

 

    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/1080ti")
    public String tio() {
        return "1080ti";
    }
    @GetMapping("/2080ti")
    public String tjugio() {
        return "2080ti";
    }
    @GetMapping("/3090ti")
    public String trettio() {
        return "3090ti";
    }
    @GetMapping("/4090")
    public String fyrtio() {
        return "4090";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/copyright")
    public String kopyrait() {
        return "copyright";
    }
    @GetMapping("/about")
    public String abouut() {
        return "about";
        
        

}
}