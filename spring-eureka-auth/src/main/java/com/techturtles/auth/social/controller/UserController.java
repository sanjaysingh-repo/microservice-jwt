package com.techturtles.auth.social.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techturtles.common.config.exceptions.ResourceNotFoundException;
import com.techturtles.common.model.User;
import com.techturtles.common.repository.UserRepository;
import com.techturtles.common.social.security.CurrentUser;
import com.techturtles.common.social.security.UserPrincipal;

@RestController
public class UserController {

    @Autowired
    @Lazy
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
