package com.faisaljarkass.demo.controllers;

import com.faisaljarkass.demo.domains.MyUser;
import com.faisaljarkass.demo.services.UserService;
import com.faisaljarkass.demo.services.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class HomeController {

    private static Logger logger = Logger.getLogger(HomeController.class.getName());

    private UserService userService;

    public HomeController(UserService userService){

        this.userService = userService;
    }

    @RequestMapping(value = {"","/","index"}, method = RequestMethod.GET)
    public String index(Model model){
        // logger.info("index method called...");

        model.addAttribute("user", new MyUser());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute MyUser user, Model model){
        // logger.info("login method ca lled with: " + user);

        user = userService.getUser(user.getUsername(), user.getPassword());

        for (int i=0; i<user.getRoles().size(); i++) {
            if (user.getRoles().get(i).equals("admin")) {
                return "adminPage";
            }
        }
        for (int i=0; i<user.getRoles().size(); i++) {
            if (user.getRoles().get(i).equals("user")) {
                return "home";
            }
        }
        model.addAttribute("error", true);
        model.addAttribute("logout", true);
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(){

        return "logout";
    }
}
