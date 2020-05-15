package com.zirearl.shmuebles.controllers;

import com.zirearl.shmuebles.models.entity.Formulario;
import com.zirearl.shmuebles.models.services.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = {"http://localhost:4200", "https://shmuebles.netlify.app"})
@RestController
@RequestMapping("/contacto")
public class FormularioController {
    @Autowired
    private FormularioService formularioService;

    @PostMapping("/formulario")
    public Formulario sendForm(@Valid @RequestBody Formulario formulario) {
        return formularioService.saveForm(formulario);
    }
}
