package com.ritik.SpringBootWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {



    @PostMapping("/add")
    public ModelAndView add(@RequestParam int num1, @RequestParam int num2, ModelAndView mv) {
        int result = num1 + num2;
//        model.addAttribute("result", result);

        mv.addObject("result",result);
        mv.setViewName("result");

        return mv;

    }

    @ModelAttribute("course")
    public String courseName()
    {
        return "java";
    }



}
