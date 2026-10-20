package com.telusko.SpringBootWeb;

import org.springframework.stereotype.Controller;

@Controller

public class HomeController {

    public String home() {
        System.out.println("home method Called");
        return "index.jsp";
    }
}
