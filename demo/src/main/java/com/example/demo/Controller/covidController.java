package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.User;
import com.example.demo.Service.covidService;


@Controller
public class covidController {

   
    covidService ser;

   
    @GetMapping("/")
    public String home() {
        return "table";
    }

     @GetMapping("/form")
    public String home2() {
        return "form";
    }

    @PostMapping("/Welcome")
    public String welcome (@ModelAttribute User user, Model model) {
        // System.out.println(User.toString());
        model.addAttribute("Name", user.getName());
           ser.add1(user);
        List<User> records = ser.getAll();
        model.addAttribute("records", records);
     
        //System.out.println("Hello spring"); <-(just for testing)
        return "form";
    }
    
}

