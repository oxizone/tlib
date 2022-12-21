package com.ufr.tlib.controllers;

import com.ufr.tlib.dataManagementServices.ILocalService;
import com.ufr.tlib.dataManagementServices.IUserService;
import com.ufr.tlib.models.Local;
import com.ufr.tlib.models.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String localCreation(@ModelAttribute("local") Local local, Model model){
        System.out.println(local);
        localService.addLocal(local);
        return "redirect:/manager/creation?success";
    }
}
