package com.example.SecurityTest.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class Controller {

    @Autowired
    private Service service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){
        return service.saveUsuario(usuario);
    }



}
