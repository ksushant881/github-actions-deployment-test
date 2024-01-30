package com.githubactions.githubactions.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

public class TestController {

    @GetMapping
    public Object getRequest() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "Github Action Deploy to AWS EC2");
        object.put("test", "sample");
        return object;
    }
}
