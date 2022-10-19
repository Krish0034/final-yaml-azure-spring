package com.yaml.p.yamlspringboot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home 
{
    @RequestMapping("/welcome")
    public String welcome()
    {
        String text="this is private Page This page is not allowed to unauthenticated users";
        return text;
    }

    @RequestMapping("/getUsers")
    public String getUsers()
    {
        return "{\"name\":\"Krishn\"}";
    }
    
}
