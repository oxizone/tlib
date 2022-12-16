package com.ufr.tlib.controllers;

import com.ufr.tlib.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralControler {

    public static final String CREATE_ACCOUNT_VIEW_NAME = "create_account";

    @GetMapping("/signup")
    public String signup(Model model){

        model.addAttribute("user",new User());
        System.out.println("okokok");
        return "create_account";
    }





}
