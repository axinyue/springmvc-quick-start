package com.demo.controller;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
public class Hello {
    @RequestMapping(method = {RequestMethod.GET})
    public @ResponseBody
    String hello(ModelMap model){
    	
        return "Hello";
    }
}
