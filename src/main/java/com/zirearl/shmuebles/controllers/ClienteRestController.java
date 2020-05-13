package com.zirearl.shmuebles.controllers;

import com.zirearl.shmuebles.models.entity.Muebles;
import com.zirearl.shmuebles.models.services.MueblesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
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

}
