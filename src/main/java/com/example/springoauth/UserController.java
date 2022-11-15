package com.example.springoauth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {



    @ResponseBody
    @GetMapping("/")
    public String homePage(){

        return "Home page";
    }

    @GetMapping("/user")
    public String users(@AuthenticationPrincipal OAuth2User principal){
        return "You are logged in as: " + principal.getAttribute("login");

    }

}
