package com.zirearl.shmuebles.models.dao;

import com.zirearl.shmuebles.models.entity.Muebles;
import org.springframework.data.repository.CrudRepository;

public interface IMuebleDao extends CrudRepository<Muebles, Integer> {
}
