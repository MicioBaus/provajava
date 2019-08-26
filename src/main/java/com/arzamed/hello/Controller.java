package com.arzamed.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String handle (@RequestParam(defaultValue = "human") String name) {
        return "Hello " + name;
    }

}
