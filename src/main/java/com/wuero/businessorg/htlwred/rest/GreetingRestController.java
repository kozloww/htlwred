package com.wuero.businessorg.htlwred.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {
    @GetMapping("greeting")
    public String greeting(@RequestParam String name){
        return "Hello " + name + "!";
    }
}
