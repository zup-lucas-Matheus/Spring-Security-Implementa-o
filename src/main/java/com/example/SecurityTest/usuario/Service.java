package com.example.SecurityTest.usuario;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    public Usuario saveUsuario(Usuario usuario) {
        return repository.save(usuario);
    }



}
