package com.ufr.tlib.controllers;

import com.ufr.tlib.dataManagementServices.ILocalService;
import com.ufr.tlib.dataManagementServices.IUserService;
import com.ufr.tlib.excepetions.UserNotFoundException;
import com.ufr.tlib.models.Local;
import com.ufr.tlib.models.Service;
import com.ufr.tlib.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.security.Principal;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    private final String root = "manager/";

    @Autowired
    private IUserService userService;
    @Autowired
    private ILocalService localService;


    @GetMapping("/creation")
    public String localForm(Model model){
        model.addAttribute("services", Service.values());
        model.addAttribute("local", new Local());
        return root + "create_local";
    }

    @PostMapping("/addLocal")
    public String localCreation(@ModelAttribute("local") @Valid Local local, Principal principal, BindingResult result, Model model) throws UserNotFoundException {
        if (result.hasErrors()) {
            model.addAttribute("services", Service.values());
            return root +"create_local";
        }
        localService.addLocal(local, principal.getName());
        return "redirect:creation?success";
    }

    @GetMapping("/liste/local")
    public String listeLocal(Principal principal,Model model) throws UserNotFoundException {
        model.addAttribute("locals",localService.getListLocalByManager(principal.getName()));
        return root + "liste_local";
    }
}
