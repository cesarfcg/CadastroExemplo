package com.example.CadastroInicial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("boasvindas")
    public String boaVindas(){
        return "Minha primeira mensagem nessa rota.";
    }
}
