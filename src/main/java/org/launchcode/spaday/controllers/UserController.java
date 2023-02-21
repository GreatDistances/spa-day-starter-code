package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    // lives at /user/add
    @GetMapping("add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        // TODO add form submission handling code here
        if (!user.getPassword().equals(verify)) {
            model.addAttribute("error", "Passwords do not match!");
            // model.addAttribute
            // model.addAttribute
            return "user/add";
        } else {
            return "user/index";
        }
    }

}
