package com.ufr.tlib.controllers;

import com.ufr.tlib.dataManagementServices.IUserService;
import com.ufr.tlib.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class GeneralControler {

    public static final String CREATE_ACCOUNT_VIEW_NAME = "create_account";

    @Autowired
    private IUserService userService;


    @GetMapping("/signup")
    public String signup(Model model){

        model.addAttribute("user",new User());
        return CREATE_ACCOUNT_VIEW_NAME;
    }

    @PostMapping(value = "/createUser")
    public String createUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model){ //@Valid
        if (result.hasErrors()) {
            return CREATE_ACCOUNT_VIEW_NAME;
        }
  /*      boolean usernameExiste = userService.isUsernameExists(user);
        System.out.println(usernameExiste);
        if (usernameExiste) {
            result.rejectValue("username","error.user","Username already exists");
            System.out.println("iciiiii");
            return CREATE_ACCOUNT_VIEW_NAME;
        }
        userService.addUser(user);*/
        return "redirect:./";
    }








}
