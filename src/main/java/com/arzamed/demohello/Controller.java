package com.arzamed.demohello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

public class Controller {

    @RestController
    private static class TheController {

        @RequestMapping("/hello")
        public String handle (@RequestParam(defaultValue = "human") String name) {
            return "Hello " + name;
        }

    }
}
