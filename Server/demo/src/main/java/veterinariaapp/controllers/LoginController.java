package veterinariaapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println( "Hello World!" );
        return "Hello World!";
    }

}
