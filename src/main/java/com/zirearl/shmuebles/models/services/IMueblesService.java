package com.zirearl.shmuebles.models.services;

import com.zirearl.shmuebles.models.entity.Muebles;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMueblesService {
    List<Muebles> findAll();
    Muebles findById(Muebles muebles);
    List<Muebles> findByCategory(Muebles muebles);
}
