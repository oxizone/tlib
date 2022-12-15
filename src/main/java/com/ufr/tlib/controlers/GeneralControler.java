package com.ufr.tlib.controlers;

import com.ufr.tlib.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

@Controller
public class GeneralControler {

    public static final String CREATE_ACCOUNT_VIEW_NAME = "create_account";

    @RequestMapping("/signup")
    public String signup(Model model){

        model.addAttribute("user",new User());
        System.out.println("okokok");
        return "create_account";
    }





}
