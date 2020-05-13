package com.zirearl.shmuebles.models.services;

import com.zirearl.shmuebles.models.entity.Muebles;

import java.util.List;

public interface IMueblesService {
    List<Muebles> findAll();
    Muebles findById(Muebles muebles);
}
