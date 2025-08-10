package com.ritik.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {



        @GetMapping("/home")
        public String homePage() {
            return "index"; // renders src/main/resources/templates/index.html
        }
    }


