package veterinariaapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import veterinariaapp.mapping.Usuario;
// otras importaciones holi
@RestController
public class LoginController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println( "Hello World!" );
        return "Hello World!";
    }

    //POST function 'login'
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario.UsuarioCredentials credentials) {
        //La llamada HTTP enviara dos variables (usuario y contraseña) que van a ser evaluados para una autenticacion
        String expectedEmail = "example@gmail.com";
        String expectedPassword = "12345";

        boolean authenticated = expectedEmail.equals(credentials.getEmail())
                                && expectedPassword.equals(credentials.getPassword());

        if (authenticated) {
            // Si la autenticación es exitosa
            return ResponseEntity.ok("Login exitoso");
        } else {
            // Si la autenticación falla
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Datos de login incorrectos");
        }
    }
    
}
