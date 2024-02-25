package ir.vanosheeh.onlineshop.controllers;

import ir.vanosheeh.onlineshop.services.SecurityService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController
{

    private final SecurityService tokenService;

    public SecurityController(SecurityService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String token(Authentication authentication) {
        System.out.println("hello");
        System.out.println("Token requested for user: "+authentication.getName());
        String token = tokenService.generateToken(authentication);
        System.out.println("Token granted: "+ token);
        return token;
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

}