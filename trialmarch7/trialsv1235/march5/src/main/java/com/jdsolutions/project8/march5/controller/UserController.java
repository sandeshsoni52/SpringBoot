package com.jdsolutions.project8.march5.controller;

import com.jdsolutions.project8.march5.model.User;
import com.jdsolutions.project8.march5.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Display the form
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // Redirect to register.html
    }

    // Handle form submission
    @PostMapping("/register")
    public String submitForm(@ModelAttribute User user) {
        userRepository.save(user);
        return "success"; // Redirect to success.html
    }
}
