package com.ufr.tlib.controlers;


import com.ufr.tlib.dataManagementServices.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserControler {

    @Autowired
    private IUserService userService;



}
