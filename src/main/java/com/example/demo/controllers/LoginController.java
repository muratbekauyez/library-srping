package com.example.demo.controllers;

import com.example.demo.dao.UserDAO;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final UserDAO userDAO;

    @Autowired
    public LoginController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @PostMapping("/login")
    public String Login(User user, @RequestParam(name = "username") String username, @RequestParam(name = "password")String password, Model model) {
        System.out.println("AUTHORIZATION: " + username);
        if (username.equals(userDAO.findByUserName(username).getUsername()) && password.equals(userDAO.findByUserName(username).getPassword())){
            user = userDAO.findByUserName(username);
            model.addAttribute("user", user);
            return "login/page-1.jsp";
        }
        return "login/page-2.jsp";

    }

}
