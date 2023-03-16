package app.ifmoney.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String index() {
        return "API Inteligência Financeira!!!";
    }
}
