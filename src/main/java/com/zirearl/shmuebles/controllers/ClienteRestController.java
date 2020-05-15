package com.zirearl.shmuebles.controllers;

import com.zirearl.shmuebles.models.entity.Muebles;
import com.zirearl.shmuebles.models.services.MueblesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200", "https://shmuebles.netlify.app"})
@RestController
@RequestMapping("/shmuebles")
public class ClienteRestController {
    @Autowired
    private MueblesService mueblesService;

    @GetMapping("/muebles")
    public List<Muebles> index() {
        return mueblesService.findAll();
    }

    @GetMapping("/muebles/{idMueble}")
    public Muebles filtrarId(Muebles muebles) {
        return mueblesService.findById(muebles);
    }

    @GetMapping("/muebles/categorias/{categoria}")
    public List<Muebles> filtrarCategoria(Muebles muebles) {
        return mueblesService.findByCategory(muebles);
    }
}
